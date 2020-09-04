package com.school.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.ui.Model;

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
}
