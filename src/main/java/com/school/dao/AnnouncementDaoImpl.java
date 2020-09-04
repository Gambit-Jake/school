package com.school.dao;

import com.school.entity.Announcement;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: ZWP
 * @Date: 2020/8/24 15:14
 * @description: TODO(公告功能持久层实现)
 * @modifiedBy:
 * @version: 1.0
 */

@Repository("announcementDao")
public class AnnouncementDaoImpl implements AnnouncementDao {


    static String mybatisxmlpath;//batis配置文件路径
    static InputStream inputStream;
    static SqlSessionFactory sqlSessionFactory;

    static {
        mybatisxmlpath = "mybatis-config.xml";
        try {
            inputStream = Resources.getResourceAsStream(mybatisxmlpath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    static SqlSession getSession() {//用于获取SqlSession
        return sqlSessionFactory.openSession();
    }

    @Override
    public int addAnnouncement(Announcement announcement) {//添加公告
        SqlSession sqlSession = getSession();
        int row = sqlSession.insert("addAnnouncement", announcement);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }

    @Override
    public Announcement findAnnouncementByAnnId(Integer ann_id) {
        SqlSession sqlSession = getSession();
        return sqlSession.selectOne("findAnnouncementByAnnId", ann_id);
    }

    @Override
    public List<Announcement> findAnnouncementByDepartmentId(Integer department_id) {
        SqlSession sqlSession = getSession();
        return sqlSession.selectList("findAnnouncementByDepartmentId", department_id);
    }

    @Override
    public List<Announcement> findAnnouncementByType(Integer type) {
        SqlSession sqlSession = getSession();
        return sqlSession.selectList("findAnnouncementByType", type);

    }

    @Override
    public List<Announcement> findAllAnnouncement() {
        SqlSession sqlSession = getSession();
        return sqlSession.selectList("findAllAnnouncement");

    }

    @Override
    public int updateAnnouncement(Announcement announcement) {
        return 0;
    }

    @Override
    public int deleteAnnouncementByAnnId(int ann_id) {
        Announcement announcement = new Announcement();
        announcement.setAnn_id(ann_id);
        SqlSession sqlSession = getSession();
        int deleteAnnouncementByAnnId = sqlSession.delete("deleteAnnouncementByAnnId", announcement);
        sqlSession.commit();
        sqlSession.close();
        return deleteAnnouncementByAnnId;


    }

    @Override
    public List<Announcement> searchAnnouncement(String str) {
        SqlSession sqlSession = getSession();
        return sqlSession.selectList("searchAnnouncement", str);
    }
}
