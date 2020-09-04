package com.school.dao;

import com.school.entity.Stugrade;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: LHP
 * @Date: 2020/8/26 0:48
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */

@Repository("stugradeDao")
public class StugradeDaoImp implements StugradeDao {
    static String mybatisxmlpath;
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

    static SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }

    @Override
    public int addStugrade(Stugrade stugrade) {
        SqlSession sqlSession = getSession();
        int row = sqlSession.insert("addStugrade", stugrade);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }

    @Override
    public Stugrade findStugradeById(Integer stu_id) {
        SqlSession sqlSession = getSession();
        Stugrade stugrade = sqlSession.selectOne("findStugradeById", stu_id);
        sqlSession.commit();
        sqlSession.close();
        return stugrade;
    }

    @Override
    public List<Stugrade> findAllStugrade() {
        SqlSession sqlSession = getSession();
        List<Stugrade> stugrades = sqlSession.selectList("findAllStugrade");
        sqlSession.commit();
        sqlSession.close();
        return stugrades;
    }

    @Override
    public int updateStugrade(Stugrade stugrade) {
        SqlSession sqlSession = getSession();
        int row = sqlSession.update("updateStugrade", stugrade);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }

    @Override
    public int deleteStugrade(Integer stu_id) {
        SqlSession sqlSession = getSession();
        int row = sqlSession.delete("deleteStugrade", stu_id);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }
}
