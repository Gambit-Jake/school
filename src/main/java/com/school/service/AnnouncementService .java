package com.school.service;

import com.school.entity.Announcement;

import java.util.List;

/**
 * @Author: ZWP
 * @Date: 2020/8/27 10:32
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */
public interface AnnouncementService {
    List<Announcement> findAllAnnouncement();

    Announcement addAnnouncement(Announcement announcement);

    List<Announcement> searchAnnouncement(String str);

    Announcement findAnnouncementByAnnId(Integer ann_id);

}
