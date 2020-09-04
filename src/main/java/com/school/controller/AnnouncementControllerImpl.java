package com.school.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.school.entity.Announcement;
import com.school.entity.Department;
import com.school.service.AnnouncementService;
import com.school.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: ZWP
 * @Date: 2020/9/2 15:55
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */

@Controller("announcementController")
public class AnnouncementControllerImpl implements AnnouncementController {
    @Resource(name = "announcementService")
    AnnouncementService announcementService;

    @Resource(name = "departmentService")
    DepartmentService departmentService;

    static Comparator<Announcement> netTypeComparator;

    static {
        netTypeComparator = Comparator.comparingInt(Announcement::getAnn_time);
    }

    @ResponseBody
    @RequestMapping("/student/toAnnouncement")
    public List<Announcement> toAnnouncement() {
        List<Announcement> announcements = announcementService.findAllAnnouncement();
        for (Announcement announcement :
                announcements) {
            announcement.toString();
        }

        Collections.sort(announcements, netTypeComparator);
        for (Announcement announcement :
                announcements) {
            announcement.toString();
        }
        return announcements;
    }

    @RequestMapping("/student/toAnnouncementList")
    @Override
    public String toAnnouncementList(String search, Model model) throws JsonProcessingException {
        List<Announcement> announcements = announcementService.searchAnnouncement(search);

        Collections.sort(announcements, netTypeComparator);
        ObjectMapper objectMapper = new ObjectMapper();
        List<String> announcementsMapper = new ArrayList<String>();
        for (Announcement announcement :
                announcements) {
            announcementsMapper.add(objectMapper.writeValueAsString(announcement));
        }
        model.addAttribute("search", search);
        model.addAttribute("announcement", announcementsMapper);
        return "/student/AnnouncementList";
    }

    @Override
    @RequestMapping("/student/toOneAnnouncement")
    public String toOneAnnouncement(Integer ann_id, Model model) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Announcement announcement = announcementService.findAnnouncementByAnnId(ann_id);
        Integer department_id = announcement.getDepartment_id();
        Department department = departmentService.findDepartmentById(department_id);
        String announcementMapper = objectMapper.writeValueAsString(announcement);
        String departmentMapper = objectMapper.writeValueAsString(department);
        model.addAttribute("announcement", announcementMapper);
        return "/student/OneAnnouncement";
    }


}
