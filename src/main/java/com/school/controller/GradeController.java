package com.school.controller;

import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

public interface GradeController {
String showgrade(HttpSession httpSession,Model model);
}
