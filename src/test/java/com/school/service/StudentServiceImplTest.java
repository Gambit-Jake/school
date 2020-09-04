package com.school.service;

import com.school.entity.StudentInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @Author: ZWP
 * @Date: 2020/8/28 15:02
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */
public class StudentServiceImplTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
    StudentService studentService = applicationContext.getBean("studentService", StudentService.class);

    @Test
    public void findAllStudent() {
        System.out.println(studentService.findAllStudent());
    }

    @Test
    public void updateStudent() {
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setStu_id(1);
        studentInfo.setBirthday((long) 126465);
        studentInfo.setDepartment("dsadsa ");
        studentInfo.setEthnic("fdsfs");
        studentInfo.setGender("fsf");
        studentInfo.setId_card_number("fdsfsfa");
        studentInfo.setName("fdsfsdfd");
        studentInfo.setNative_place("fdsfdfdsf");
        studentService.updateStudent(studentInfo);
    }

    @Test
    public void deleteStudent() {
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setStu_id(1);
        studentInfo.setBirthday((long) 126465);
        studentInfo.setDepartment("dsadsa ");
        studentInfo.setEthnic("fdsfs");
        studentInfo.setGender("fsf");
        studentInfo.setId_card_number("fdsfsfa");
        studentInfo.setName("fdsfsdfd");
        studentInfo.setNative_place("fdsfdfdsf");
        studentService.deleteStudent(1);
    }
}