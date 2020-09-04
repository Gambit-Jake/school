package com.school.service;

import com.school.entity.StudentInfo;

import java.util.List;

/**
 * @Author: ZWP
 * @Date: 2020/8/27 11:08
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */
public interface StudentService {
    List<StudentInfo> findAllStudent();
    //使用StudentDao中的函数
    StudentInfo updateStudent(StudentInfo studentInfo);
    //需要Dao层的update函数，需要允许为空
    int deleteStudent(Integer student_id);
    //需要使用id删除学生的函数

    StudentInfo findStudentInfoById(Integer id);

}
