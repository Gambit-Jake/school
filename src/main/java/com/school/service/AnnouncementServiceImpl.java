package com.school.service;

import com.school.dao.AnnouncementDao;
import com.school.entity.Announcement;
import com.school.utils.LogUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: ZWP
 * @Date: 2020/8/25 19:45
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */
@Service("announcementService")
public class AnnouncementServiceImpl implements AnnouncementService{
    @Resource(name = "announcementDao")
    AnnouncementDao announcementDao;
    @Resource(name = "logUtils")
    LogUtils logUtils;

    public List<Announcement> findAllAnnouncement() {
        List<Announcement> announcements = announcementDao.findAllAnnouncement();
        logUtils.logPrint("Service", "findAllAnnouncement", "success");
        return announcements;
    }

    public Announcement addAnnouncement(Announcement announcement) {
        announcementDao.addAnnouncement(announcement);
        logUtils.logPrint("Service", "addAnnouncement", "success");
        return announcement;
    }

    @Override
    public List<Announcement> searchAnnouncement(String str) {
        List<Announcement> announcements = announcementDao.searchAnnouncement(str);
        logUtils.logPrint("Service", "searchAnnouncement", "success");
        return announcements;
    }

}
