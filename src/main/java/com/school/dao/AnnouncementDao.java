package com.school.dao;

import com.school.entity.Announcement;

import java.util.List;

/**
 * @Author: ZWP
 * @Date: 2020/8/24 14:55
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */
public interface AnnouncementDao {
    int addAnnouncement(Announcement announcement);

    Announcement findAnnouncementByAnnId(Integer ann_id);

    List<Announcement> findAnnouncementByDepartmentId(Integer department_id);

    List<Announcement> findAnnouncementByType(Integer type);

    List<Announcement> findAllAnnouncement();

    int updateAnnouncement(Announcement announcement);

    int deleteAnnouncementByAnnId(int ann_id);

    List<Announcement> searchAnnouncement(String str);

}