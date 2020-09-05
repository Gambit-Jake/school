package com.school.service;

import com.school.dao.StudentInfoDao;
import com.school.dao.StugradeDao;
import com.school.entity.StudentInfo;
import com.school.entity.Stugrade;
import com.school.utils.LogUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service("excelService")
public class ExcelServiceImpl implements ExcelService {

   @Resource(name="studentInfoDao")
    private StudentInfoDao studentInfoDao;
  @Resource(name = "stugradeDao")
    private StugradeDao stugradeDao;
  @Resource(name = "logUtils")
  private LogUtils logUtils;
    @Override
    public Workbook getExcel(String fileName) throws Exception {
        InputStream is = new FileInputStream(new File(fileName));
        Workbook hssfWorkbook = null;
        if (fileName.endsWith("xlsx")){
            hssfWorkbook = new XSSFWorkbook(is);//Excel 2007
        }else if (fileName.endsWith("xls")){
            hssfWorkbook = new HSSFWorkbook(is);//Excel 2003
        }
        return hssfWorkbook;
    }

    @Override
    public String cleanStuInfoExcel(Workbook hssfWorkbook) {
        boolean mis = false, dup = false,col=true;//缺失、重复、列名错误的标志
        boolean preCol=true;
        Sheet sht = hssfWorkbook.getSheetAt(0);
        //查看列名是否正确
        Row r0=sht.getRow(0);
        for(int i=0;i<=7;i++)
            if(r0.getCell(i)==null)
            {
                preCol=false;
                break;
            }
        if(preCol==true)
            if(r0.getCell(0).getStringCellValue().equals("学号")&&
                    r0.getCell(1).getStringCellValue().equals("姓名")&&
                    r0.getCell(2).getStringCellValue().equals("性别")&&
                    r0.getCell(3).getStringCellValue().equals("生日")&&
                    r0.getCell(4).getStringCellValue().equals("民族")&&
                    r0.getCell(5).getStringCellValue().equals("身份证号码")&&
                    r0.getCell(6).getStringCellValue().equals("籍贯")&&
                    r0.getCell(7).getStringCellValue().equals("院系"))
                col=false;
        //查看数据是否有缺失
        Loop:for (Row row:sht) {
            if(row.getRowNum()==0) continue;
            for (int i=0;i<row.getLastCellNum();i++) {
                Cell cell=row.getCell(i);
                if (cell == null||cell.getCellType() ==Cell.CELL_TYPE_BLANK)
                {
                    mis=true;
                    break Loop;
                }
            }
        }
        //查看数据是否有重复
        Set<Integer> set = new HashSet<Integer>();
        for (Row row:sht) {
            if(row.getRowNum()==0) continue;
            Cell cell = row.getCell(0);
            if(cell!=null) {
                if (set.contains((int) cell.getNumericCellValue())) {
                    dup = true;
                    break;
                } else set.add((int) cell.getNumericCellValue());
            }
        }
        String result="";
        if(col) result+="列名不正确";
        if(!result.equals("")) result+="、";
        if(mis) result+="数据项缺失";
        if(!result.equals("")&&result.charAt(result.length()-1)!='、') result+="、";
        if(dup) result+="数据重复";
        if(result.equals("")) return null;
        else{
            if(result.charAt(result.length()-1)=='、') result=result.substring(0,result.length()-1);
            result+="，请修改输入的数据！";
            return result;
        }
    }

    @Override
    public String cleanStuGradeExcel(Workbook hssfWorkbook) {
        boolean mis = false, dup = false,col=true;
        boolean preCol=true;
        Sheet sht = hssfWorkbook.getSheetAt(0);
        //查看列名是否正确
        Row r0=sht.getRow(0);
        for(int i=0;i<=6;i++)
            if(r0.getCell(i)==null)
            {
                preCol=false;
                break;
            }
        if(preCol==true)
            if(r0.getCell(0).getStringCellValue().equals("学号")&&
                    r0.getCell(1).getStringCellValue().equals("操作系统")&&
                    r0.getCell(2).getStringCellValue().equals("数据结构")&&
                    r0.getCell(3).getStringCellValue().equals("高等数学")&&
                    r0.getCell(4).getStringCellValue().equals("大学物理")&&
                    r0.getCell(5).getStringCellValue().equals("Java")&&
                    r0.getCell(6).getStringCellValue().equals("Python"))
                col=false;
        //查看数据是否有缺失
        Set<Integer> set = new HashSet<Integer>();
        for (Row row:sht) {
            if(row.getRowNum()==0) continue;
            Cell cell = row.getCell(0);
            if (cell == null||cell.getCellType() ==Cell.CELL_TYPE_BLANK) {
                mis = true;
                break;
            }
        }
        //查看数据是否有重复
        for (Row row:sht) {
            if(row.getRowNum()==0) continue;
            Cell cell = row.getCell(0);
            if (cell != null) {
                if (set.contains((int) cell.getNumericCellValue())) {
                    dup = true;
                    break;
                } else set.add((int) cell.getNumericCellValue());
            }
        }
        String result="";
        if(col) result+="列名不正确";
        if(!result.equals("")) result+="、";
        if(mis) result+="数据项缺失";
        if(!result.equals("")&&result.charAt(result.length()-1)!='、') result+="、";
        if(dup) result+="数据重复";
        if(result.equals("")) return null;
        else{
            if(result.charAt(result.length()-1)=='、') result=result.substring(0,result.length()-1);
            result+="，请修改输入的数据！";
            return result;
        }
    }

    @Override
    public void readStuInfoExcel(Workbook hssfWorkbook) throws ParseException {

      Workbook excel=hssfWorkbook;
        StudentInfo studentInfo=new StudentInfo();
        List<StudentInfo> list = new ArrayList<StudentInfo>();
        for (int numSheet = 0; numSheet <hssfWorkbook.getNumberOfSheets(); numSheet++) {

            Sheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
            if (hssfSheet == null) {
                continue;
            }
            // 循环行Row
            for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                //HSSFRow hssfRow = hssfSheet.getRow(rowNum);
                Row hssfRow = hssfSheet.getRow(rowNum);
                if (hssfRow != null) {
                    studentInfo = new StudentInfo();

                    Cell id = hssfRow.getCell(0);
                    Cell name = hssfRow.getCell(1);
                    Cell gender=hssfRow.getCell(2);
                    Cell birthday=hssfRow.getCell(3);
                    Cell ethnic=hssfRow.getCell(4);
                    Cell id_card_number=hssfRow.getCell(5);
                    Cell native_place=hssfRow.getCell(6);
                    Cell department=hssfRow.getCell(7);

                    //这里是自己的逻辑
                    studentInfo.setStu_id((int)id.getNumericCellValue());
                    studentInfo.setName(name.toString());
                    studentInfo.setGender(gender.toString());
                    studentInfo.setBirthday(birthday.getDateCellValue().getTime()-1598416885016L);
                    studentInfo.setEthnic(ethnic.toString());
                    studentInfo.setId_card_number(id_card_number.toString());
                    studentInfo.setNative_place(native_place.toString());
                    studentInfo.setDepartment(department.toString());

                    list.add(studentInfo);
                }
            }

        }  for( StudentInfo studentInfo1 : list){
            studentInfoDao.addStudentInfo(studentInfo1);
        }
//        System.out.println(list);
        logUtils.logPrint("ExcelUpload","StudentInfo upload by excel","Success");


    }

    @Override
    public void readStuGradeExcel(Workbook hssfWorkbook) {

        Stugrade stugrade=new Stugrade();
        List<Stugrade> list = new ArrayList<Stugrade>();
        for (int numSheet = 0; numSheet <hssfWorkbook.getNumberOfSheets(); numSheet++) {

            Sheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
            if (hssfSheet == null) {
                continue;
            }
            // 循环行Row
            for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                //HSSFRow hssfRow = hssfSheet.getRow(rowNum);
                Row hssfRow = hssfSheet.getRow(rowNum);
                if (hssfRow != null) {
                    stugrade = new Stugrade();

                    Cell stu_id = hssfRow.getCell(0);
                    Cell operating_system = hssfRow.getCell(1);
                    Cell data_structure=hssfRow.getCell(2);
                    Cell math=hssfRow.getCell(3);
                    Cell physics=hssfRow.getCell(4);
                    Cell java=hssfRow.getCell(5);
                    Cell python=hssfRow.getCell(6);


                    //这里是自己的逻辑
                    stugrade.setStu_id((int)stu_id.getNumericCellValue());
                    stugrade.setOperating_system((float)operating_system.getNumericCellValue());
                    stugrade.setData_structure((float)data_structure.getNumericCellValue());
                   stugrade.setMath((float)math.getNumericCellValue());
                   stugrade.setPhysics((float)physics.getNumericCellValue());
                   stugrade.setJava((float)java.getNumericCellValue());
                   stugrade.setPython((float)python.getNumericCellValue());
                    list.add(stugrade);
                }
            }

        } for( Stugrade stugrade1 : list){
           stugradeDao.addStugrade(stugrade1);
        }
//        System.out.println(list);
        logUtils.logPrint("ExcelUpload","StudentGrade upload by excel","Success");
    }

    @Override
    public void writeStuInfoExcel(List<StudentInfo> list) throws Exception {
        //创建HSSFWorkbook对象(excel的文档对象)
        HSSFWorkbook wb = new HSSFWorkbook();

        //建立新的sheet对象（excel的表单）
        HSSFSheet sheet=wb.createSheet("学生个人信息表");

        //在sheet里创建第一行
        HSSFRow row1=sheet.createRow(0);
        //创建单元格并设置单元格内容
        row1.createCell(0).setCellValue("学号");
        row1.createCell(1).setCellValue("姓名");
        row1.createCell(2).setCellValue("性别");
        row1.createCell(3).setCellValue("生日");
        row1.createCell(4).setCellValue("民族");
        row1.createCell(5).setCellValue("身份证号码");
        row1.createCell(6).setCellValue("籍贯");
        row1.createCell(7).setCellValue("院系");
        for(int i=0;i<list.size();i++) {
            //在sheet里插入数据
            HSSFRow row3 = sheet.createRow(i+1);
            row3.createCell(0).setCellValue(list.get(i).getStu_id());
            row3.createCell(1).setCellValue(list.get(i).getName());
            row3.createCell(2).setCellValue(list.get(i).getGender());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            row3.createCell(3).setCellValue(sdf.format(list.get(i).getBirthday()));
            row3.createCell(4).setCellValue(list.get(i).getEthnic());
            row3.createCell(5).setCellValue(list.get(i).getId_card_number());
            row3.createCell(6).setCellValue(list.get(i).getNative_place());
            row3.createCell(7).setCellValue(list.get(i).getDepartment());


        }
        File file=new File("D:/excel/info.xls");
        OutputStream output=new FileOutputStream(file);
        wb.write(output);
        output.close();
        logUtils.logPrint("ExcelOutput","StudentInfo output in excel","Success");


    }

    @Override
    public void writeStuGradeExcel(List<Stugrade> list) throws IOException {
        //创建HSSFWorkbook对象(excel的文档对象)
        HSSFWorkbook wb = new HSSFWorkbook();

        //建立新的sheet对象（excel的表单）
        HSSFSheet sheet=wb.createSheet("学生成绩表");

        //在sheet里创建第一行
        HSSFRow row1=sheet.createRow(0);
        //创建单元格并设置单元格内容
        row1.createCell(0).setCellValue("学号");
        row1.createCell(1).setCellValue("操作系统");
        row1.createCell(2).setCellValue("数据结构");
        row1.createCell(3).setCellValue("高等数学");
        row1.createCell(4).setCellValue("大学物理");
        row1.createCell(5).setCellValue("Java");
        row1.createCell(6).setCellValue("Python");

        for(int i=0;i<list.size();i++) {
            //在sheet里插入数据
            HSSFRow row3 = sheet.createRow(i+1);
            row3.createCell(0).setCellValue(list.get(i).getStu_id());
            row3.createCell(1).setCellValue(list.get(i).getOperating_system());
            row3.createCell(2).setCellValue(list.get(i).getData_structure());
            row3.createCell(3).setCellValue(list.get(i).getMath());
            row3.createCell(4).setCellValue(list.get(i).getPhysics());
            row3.createCell(5).setCellValue(list.get(i).getJava());
            row3.createCell(6).setCellValue(list.get(i).getPython());



        }
        File file=new File("D:/excel/grade.xls");
        OutputStream output=new FileOutputStream(file);
        wb.write(output);
        output.close();
        logUtils.logPrint("ExcelOutput","StudentGrade output in excel","Success");

    }



}
