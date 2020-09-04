package com.school.dao;

import com.school.entity.StudentInfo;

import java.util.List;

public interface StudentInfoDao {
    int addStudentInfo(StudentInfo studentInfo);

    StudentInfo findStudentInfoById(int stuId);

    List<StudentInfo> findAll();

    int updateStudentInfo(StudentInfo studentInfo);

    int deleteStudentInfo(StudentInfo studentInfo);

}
