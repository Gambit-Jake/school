package com.school.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.school.entity.Announcement;
import org.springframework.ui.Model;

import java.util.List;

/**
 * @Author: ZWP
 * @Date: 2020/9/2 15:50
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */

public interface AnnouncementController {
    List<Announcement> toAnnouncement();

    String toOneAnnouncement(Integer ann_id, Model model) throws JsonProcessingException;

    String toAnnouncementList(String search, Model model) throws JsonProcessingException;
}
