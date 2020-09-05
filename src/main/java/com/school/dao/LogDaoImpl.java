package com.school.dao;

import com.school.entity.Log;
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
 * @Date: 2020/8/24 15:34
 * @description: TODO(日志功能持久层实现)
 * @modifiedBy:
 * @version: 1.0
 */
@Repository("logDao")
public class LogDaoImpl implements LogDao {

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
    public int addLog(Log log) {
        SqlSession sqlSession = getSession();
        int row = sqlSession.insert("addLog", log);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }

    @Override
    public List<Log> findAllLog() {
        SqlSession sqlSession = getSession();
        return sqlSession.selectList("findAllLog");
    }
}
