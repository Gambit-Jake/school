package com.school.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.school.entity.StudentInfo;
import com.school.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @Author: ZWP
 * @Date: 2020/9/3 16:44
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */
@Controller("studentInfo")
public class StudentInfoControllerImpl implements StudentInfoController {
    @Resource(name = "studentService")
    StudentService studentService;

    @Override
    @RequestMapping("/student/toStudentInfo")
    public String toStudentInfo(HttpSession httpSession, Model model) throws JsonProcessingException {
        httpSession.setAttribute("STUDENT_ID", 60);
        Integer ID = (Integer) httpSession.getAttribute("STUDENT_ID");
        StudentInfo studentInfo = studentService.findStudentInfoById(ID);
        System.out.println(studentInfo.toString());
        ObjectMapper objectMapper = new ObjectMapper();
        String studentInfoMapper = objectMapper.writeValueAsString(studentInfo);
        System.out.println(studentInfoMapper);
        model.addAttribute("studentInfo", studentInfoMapper);
        return "/student/StudentInfo";
    }

    @RequestMapping("/student/changeStudentInfo")
    @ResponseBody
    public StudentInfo changeStudentInfo(@RequestBody StudentInfo studentInfo, HttpSession httpSession) {
        studentInfo.setStu_id((Integer) httpSession.getAttribute("STUDENT_ID"));
        studentService.updateStudent(studentInfo);
        return studentInfo;
    }
}
