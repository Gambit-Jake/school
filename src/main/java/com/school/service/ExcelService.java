package com.school.service;

import com.school.entity.StudentInfo;
import com.school.entity.Stugrade;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface ExcelService {
    Workbook getExcel(String filename) throws FileNotFoundException, Exception;

    String cleanStuInfoExcel(Workbook hssfWorkbook);
    String cleanStuGradeExcel(Workbook hssfWorkbook);

    void readStuInfoExcel(Workbook hssfWorkbook) throws ParseException;
    void readStuGradeExcel(Workbook hssfWorkbook);

    void writeStuInfoExcel(List<StudentInfo> list) throws FileNotFoundException, Exception;
    void writeStuGradeExcel(List<Stugrade> list) throws IOException;
}
