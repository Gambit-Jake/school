package com.school.service;

import com.school.dao.AnnouncementDao;
import com.school.dao.HyperLinksDao;
import com.school.dao.StudentInfoDao;
import com.school.dao.StugradeDao;
import com.school.entity.Announcement;
import com.school.entity.HyperLinks;
import com.school.entity.StudentInfo;
import com.school.entity.Stugrade;
import com.school.utils.LogUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("extraWebsiteService")
public class ExtraWebsiteServiceImp implements ExtraWebsiteService {

    @Resource(name = "announcementDao")
    AnnouncementDao announcementDao;
    @Resource(name = "stugradeDao")
    StugradeDao stugradeDao;
    @Resource(name = "studentInfoDao")
    StudentInfoDao studentInfoDao;
    @Resource(name = "hyperlinksDao")
    HyperLinksDao hyperLinksDao;

    @Resource(name = "logUtils")
    LogUtils logUtils;
    /*
    根据学院ID查找公告
    一共5个学院：1.通信工程学院   2.电子信息学院   3.计算机学院   4.物理与光电工程学院   5.微电子学院 前端只给5个选项，不需要异常控制
    */
    @Override
    public List<Announcement> QueryAnnouncementByDepartment(Integer Department_id) {
        List<Announcement> announcements = announcementDao.findAnnouncementByDepartmentId(Department_id);
        logUtils.logPrint("Service", "QueryAnnouncementByDepartment", "success");
        return announcements;
    }
    /*
    根据公告类型查找公告
    一共给3种类型公告 1.生活通知（包括后勤，水电）   2.成绩通知（期末考成绩）   3.活动通知（学院活动，学术讲座，学生会活动）
    */
    @Override
    public List<Announcement> QueryAnnouncementByType(Integer ann_type) {
        List<Announcement> announcements = announcementDao.findAnnouncementByType(ann_type);
        logUtils.logPrint("Service", "QueryAnnouncementByType", "success");
        return announcements;
    }
    /*
    查询学生的成绩信息
    */
    @Override
    public Stugrade QueryStugrade(Integer stu_id) {
        Stugrade stugrade;
        stugrade = stugradeDao.findStugradeById(stu_id);
        logUtils.logPrint("Service","QueryStugrade","success");
        return stugrade;
    }

    @Override
    public List<HyperLinks> QueryHyperLink() {
        List<HyperLinks> hyperLinks = hyperLinksDao.findAllHyperLinks();
        logUtils.logPrint("Service","QueryHyperLink","success");
        return hyperLinks;
    }



    //插入公告,错误有5个从-1到-5，正确为0
    @Override
    public int AnnouncementPublish(Announcement announcement) {
        //department错误
        if(announcement.getDepartment_id() > 5 || announcement.getDepartment_id() <1){
            logUtils.logPrint("Service","AnnouncementPublish","department error");
            return -1;
        }
        //type错误
        if(announcement.getAnn_type()> 3 || announcement.getAnn_type() <1){
            logUtils.logPrint("Service","AnnouncementPublish","type error");
            return -2;
        }
        //ann_title错误
        if(announcement.getAnn_title().equals(null)){
            logUtils.logPrint("Service","AnnouncementPublish","title error");
            return -3;
        }
        //content错误
        if(announcement.getAnn_content().equals(null)){
            logUtils.logPrint("Service","AnnouncementPublish","content error");
            return -4;
        }
        //插入数据库
        long t1=System.currentTimeMillis() - 1598416885016l;
        int t = (int)t1;
        announcement.setAnn_time(t);
        int re = announcementDao.addAnnouncement(announcement);
        if(re == 1){
            logUtils.logPrint("Service","AnnouncementPublish","success");
            return 0;
        }
        logUtils.logPrint("Service","AnnouncementPublish","add error");
        return -5;
    }

    //仅支持一次性输入一个学生的所有成绩
    @Override
    public int StuedentgradPublish(Stugrade stugrade) {
        //whether student exist
        if(studentInfoDao.findStudentInfoById(stugrade.getStu_id())==null){
            logUtils.logPrint("Service","StudentgradPublish","stu_id null");
            return -4;
        }
        //判断学生成绩是否存在
        if(stugradeDao.findStugradeById(stugrade.getStu_id())!=null){
            logUtils.logPrint("Service","StudentgradPublish","stu_id error");
            return -1;
        }
        //成绩非法输入
        if(stugrade.getOperating_system() < 0 ||  stugrade.getData_structure()<0 || stugrade.getMath()<0 || stugrade.getPhysics()<0 || stugrade.getJava() <0 || stugrade.getPython()<0 ){
            logUtils.logPrint("Service","StudentgradPublish","grade error");
            return -2;
        }
        //输入成绩
        int re = stugradeDao.addStugrade(stugrade);
        if(re == 1){
            logUtils.logPrint("Service","StudentgradPublish","success");
            return 0;
        }
        logUtils.logPrint("Service","StudentgradPublish","add error");
        return -3;
    }

    //管理学生信息
    @Override
    public int ManagerStuInfo(StudentInfo studentInfo){
        if(stugradeDao.findStugradeById(studentInfo.getStu_id())==null){
            logUtils.logPrint("Service","ManagerStuInfo","stu_id error");
            return -1;
        }

        int re = studentInfoDao.updateStudentInfo(studentInfo);
        if(re == 1){
            logUtils.logPrint("Service","ManagerStuInfo","success");
            return -2;
        }
        logUtils.logPrint("Service","ManagerStuInfo","update error");
        return 0;
    }

    @Override
    public int AddHyperLink(HyperLinks hyperLinks) {
        if(hyperLinks.getFunction_name() == null){
            logUtils.logPrint("Service","AddHyperLink","function_name error");
            return  -1;
        }
        if(hyperLinks.getFunction_link() == null){
            logUtils.logPrint("Service","AddHyperLink","function_link error");
            return -2;
        }
        int re = hyperLinksDao.insertHyperLinks(hyperLinks);
        if(re == 1){
            logUtils.logPrint("Service","AddHyperLink","success");
            return  0;
        }
        logUtils.logPrint("Service","AddHyperLink","add error");
        return -3;
    }

    @Override
    public int UpdateHyperLink(HyperLinks hyperLinks) {
        if(hyperLinksDao.findHyperLinksByFuncId(hyperLinks.getFunction_id()) == null){
            logUtils.logPrint("Service","UpdateHyperLink","find error");
            return -1;
        }
        if(hyperLinks == null){
            logUtils.logPrint("Service","UpdateHyperLink","find error");
            return -1;
        }

        int re = hyperLinksDao.updateHyperLinks(hyperLinks);
        if(re == 1){
            logUtils.logPrint("Service","UpdateHyperLink","success");
            return -2;
        }
        logUtils.logPrint("Service","UpdateHyperLink","update error");
        return 0;
    }

    @Override
    public int DeleteHyperLink(Integer function_id) {
        int re = hyperLinksDao.deleteHyperLinksByFuncId(function_id);
        if(re == 1){
            logUtils.logPrint("Service","DeleteHyperLink","success");
            return 0;
        }
        logUtils.logPrint("Service","DeleteHyperLink","delete error");
        return -1;
    }
}
