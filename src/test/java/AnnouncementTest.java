import com.school.dao.*;
import com.school.entity.*;
import com.school.service.ExcelService;
import com.school.service.ExtraWebsiteService;
import com.school.service.ExtraWebsiteServiceImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: ZWP
 * @Date: 2020/8/24 15:21
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */
public class AnnouncementTest {
@Test
    public void AnnouncementTest(){
    Announcement announcement=new Announcement();
    announcement.setAnn_id(2);
    announcement.setDepartment_id(1);
    announcement.setAnn_type(1);
    announcement.setAnn_title("123");
    announcement.setAnn_content("123");
    announcement.setAnn_time(112233);
    AnnouncementDao announcementDao=new AnnouncementDaoImpl();
//    announcementDao.addAnnouncement(announcement);
//    announcementDao.deleteAnnouncementByAnnId(1);
//    System.out.println(announcementDao.findAnnouncementByAnnId(1));
//    System.out.println(announcementDao.findAnnouncementByType(1));
//    System.out.println(announcementDao.findAnnouncementByDepartmentId(1));
//    System.out.println(  announcementDao.findAllAnnouncement());

    }
    @Test
    public void DepartmentTest(){
        Department department=new Department();
        department.setAuthority(2);
        department.setDepartment_id(1);
        department.setTemplate(1);
        DepartmentDao departmentDao=new DepartmentDaoImpl();
//        departmentDao.insertDepartment(department);
//        System.out.println(departmentDao.findDepartmentByDepId(1));
//        departmentDao.updateDepartment(department);
        departmentDao.deleteDepartmentByDepId(1);



    }
    public static final String[] encodes = new String[] { "UTF-8", "GBK", "GB2312", "ISO-8859-1", "ISO-8859-2" };
    @Test
    public void string(){
        System.out.println(getEncode("中文"));
    }
    public  static String getEncode(String str) {
            byte[] data = str.getBytes();
            byte[] b = null;
            a:for (int i = 0; i < encodes.length; i++) {
                try {
                    b = str.getBytes(encodes[i]);
                    if (b.length!=data.length)
                        continue;
                    for (int j = 0; j < b.length; j++) {
                        if (b[j] != data[j]) {
                            continue a;
                        }
                    }
                    return encodes[i];
                } catch (UnsupportedEncodingException e) {
                    continue;
                }
            }
            return null;
        }


    @Test
    public void LogTest(){
        ExtraWebsiteService extraWebsiteService=new ExtraWebsiteServiceImp();
        CourseDao courseDao=new CourseDaoImpl();
        StugradeDao stugradeDao=new StugradeDaoImp();
        Stugrade stugrade=stugradeDao.findStugradeById(2);

        List<Float> score=new ArrayList();
        score.add(stugrade.getOperating_system());
        score.add(stugrade.getData_structure());
        score.add(stugrade.getMath());
        score.add(stugrade.getPhysics());
        score.add(stugrade.getJava());
        score.add(stugrade.getPython());

        StugradeDTO stugradeDTO =new StugradeDTO();
        List<StugradeDTO> stugradeDTOList =new ArrayList<StugradeDTO>();
        for (int i=1;i<=6;i++){
            stugradeDTO.setStu_id(2);
            stugradeDTO.setCourse_id(i);
            stugradeDTO.setCourse_name(courseDao.findCourseById(i).getCourse_name());
            stugradeDTO.setCourse_type(courseDao.findCourseById(i).getCourse_type());
            stugradeDTO.setCredit(courseDao.findCourseById(i).getCredit());
            stugradeDTO.setTerm(courseDao.findCourseById(i).getTerm());
            stugradeDTO.setScore(score.get(i-1));
            stugradeDTOList.add(stugradeDTO);

        }
        for(StugradeDTO stugradeDTO1:stugradeDTOList){
            System.out.println(stugradeDTO1);
        }

    }

    @Test
   public void readExcel() throws Exception{
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-service.xml");
//        ExcelService excelHandle=applicationContext.getBean("excelHandle", ExcelService.class);
        ExtraWebsiteService extraWebsiteService=applicationContext.getBean("extraWebsiteService",ExtraWebsiteService.class);
        System.out.println(extraWebsiteService.QueryHyperLink());
//        System.out.println(extraWebsiteService.DeleteHyperLink(1));
//        System.out.println(extraWebsiteService.AddHyperLink(hyperLinks));
//        System.out.println(extraWebsiteService.AnnouncementPublish(announcement));
//        System.out.println(extraWebsiteService.UpdateHyperLink(hyperLinks));
//        System.out.println(extraWebsiteService.ManagerStuInfo(studentInfo));
//        System.out.println(extraWebsiteService.QueryAnnouncementByDepartment(2));
//         System.out.println(extraWebsiteService.QueryAnnouncementByType(2));
//        System.out.println(extraWebsiteService.QueryStugrade(2));
        Stugrade stugrade = new Stugrade();
        stugrade.setPython((float)98.00);
        stugrade.setJava((float)98.00);
        stugrade.setPhysics((float)98.00);
        stugrade.setMath((float)98.00);
        stugrade.setData_structure((float)98.00);
        stugrade.setOperating_system((float)98.00);
        stugrade.setStu_id(23);

        System.out.println(extraWebsiteService.StuedentgradPublish(stugrade));




//    excelHandle.readStuInfoExcel(excelHandle.getExcel("C:/Users/Gambit/Desktop/test.xlsx"));
//    excelHandle.readStuGradeExcel(excelHandle.getExcel("C:/Users/Gambit/Desktop/test2.xlsx"));
//        StudentInfoDao studentInfoDao=new StudentInfoDaoImpl();
//        List<StudentInfo> list=studentInfoDao.findAll();
//      excelHandle.writeStuInfoExcel(list);
//        StugradeDao stugradeDao=new StugradeDaoImp();
//        List<Stugrade> allStugrade = stugradeDao.findAllStugrade();
//        excelHandle.writeStuGradeExcel(allStugrade);


    }
    @Test
    public  void StuInfoTest() throws IOException {
        StudentInfo studentInfo=new StudentInfo();
        studentInfo.setStu_id(2);
        studentInfo.setName("xiaohei");
        studentInfo.setGender("male");
        Date date=new Date(1999,7,6);
        studentInfo.setBirthday(date.getTime());
        studentInfo.setEthnic("hanzu");
        studentInfo.setId_card_number("633333");
        studentInfo.setNative_place("beijing");
        studentInfo.setDepartment("software");
        StudentInfoDao studentInfoDao=new StudentInfoDaoImpl();
//      studentInfoDao.addStudentInfo(studentInfo);
//        studentInfoDao.updateStudentInfo(studentInfo);
//        System.out.println(studentInfoDao.findAll());
//        System.out.println(studentInfoDao.findStudentInfoById(1));
        studentInfoDao.deleteStudentInfo(studentInfo);



    }
}

