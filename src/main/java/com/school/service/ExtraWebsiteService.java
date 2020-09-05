package com.school.service;

import com.school.entity.Announcement;
import com.school.entity.HyperLinks;
import com.school.entity.StudentInfo;
import com.school.entity.Stugrade;

import java.util.List;

public interface ExtraWebsiteService {
    //学生方面的功能
    List<Announcement> QueryAnnouncementByDepartment(Integer Department_id);
    List<Announcement> QueryAnnouncementByType(Integer ann_type);
    Stugrade QueryStugrade(Integer stu_id);
    List<HyperLinks> QueryHyperLink();
    //学校方面的功能
    int AnnouncementPublish(Announcement announcement);
    int StuedentgradPublish(Stugrade stugrade);
    int ManagerStuInfo(StudentInfo studentInfo);
    int AddHyperLink(HyperLinks hyperLinks);
    int UpdateHyperLink(HyperLinks hyperLinks);
    int DeleteHyperLink(Integer function_id);

}
