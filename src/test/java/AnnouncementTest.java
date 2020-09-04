import com.school.dao.AnnouncementDao;
import com.school.dao.AnnouncementDaoImpl;
import com.school.entity.Announcement;

import java.util.List;

/**
 * @Author: ZWP
 * @Date: 2020/8/24 15:21
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */
public class AnnouncementTest {
    public static void main(String[] args) {
        AnnouncementDao announcementDao = new AnnouncementDaoImpl();
        Announcement announcement = new Announcement();
        announcement.setAnn_type(1);
        announcement.setAnn_time(456);
        announcement.setAnn_title("4324");
        announcement.setAnn_content("43243");
        announcement.setDepartment_id(34432234);
        int row = announcementDao.addAnnouncement(announcement);
//        List<Announcement> announcements = announcementDao.findAnnouncementByDepartmentId(1);
        List<Announcement> announcements = announcementDao.findAllAnnouncement();
        for (Announcement ann:
                announcements) {
            System.out.println(ann.toString());
        }
//        System.out.println(announcementDao.findAnnouncementByAnnId(2).toString());
    }
}
