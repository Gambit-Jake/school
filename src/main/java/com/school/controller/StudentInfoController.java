package com.school.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.school.entity.StudentInfo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpSession;

/**
 * @Author: ZWP
 * @Date: 2020/9/3 16:30
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */
public interface StudentInfoController {
    String toStudentInfo(HttpSession httpSession, Model model) throws JsonProcessingException;

    StudentInfo changeStudentInfo(@RequestBody StudentInfo studentInfo, HttpSession httpSession);
}
