package com.school.service;

import com.school.entity.Announcement;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @Author: ZWP
 * @Date: 2020/8/28 14:49
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */
public class AnnouncementServiceImplTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
    AnnouncementService announcementService = applicationContext.getBean("announcementService", AnnouncementService.class);
    @Test
    public void findAllAnnouncement() {
       announcementService.findAllAnnouncement();
    }

    @Test
    public void addAnnouncement() {
        Announcement announcement = new Announcement();
        announcement.setAnn_type(1);
        announcement.setAnn_time(1);
        announcement.setAnn_title("School");
        announcement.setAnn_content("School Administrative office staff\n" +
                "Graduate Instructor Office: Miao Yabin, Zhu Hai, Yang Chao\n" +
                "Executive Office");
        announcement.setDepartment_id(12);
        announcementService.addAnnouncement(announcement);
    }
    @Test
    public void searchAnnouncement(){
        announcementService.searchAnnouncement("填");
    }
}