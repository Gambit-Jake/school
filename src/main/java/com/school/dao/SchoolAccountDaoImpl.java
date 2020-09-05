package com.school.dao;

import com.school.entity.SchoolAccount;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;

@Repository("schoolAccountDao")
public class SchoolAccountDaoImpl implements SchoolAccountDao {
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
    public int addSchoolAccount(SchoolAccount schoolAccount) { //添加账户
        SqlSession sqlSession = getSession();
        int row = sqlSession.insert("addSchoolAccount", schoolAccount);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }

    @Override
    public SchoolAccount findSchoolAccountByAccountId(Integer account_id) { //根据ID查找
        SqlSession sqlSession = getSession();
        SchoolAccount re = sqlSession.selectOne("findSchoolAccountByAccountId", account_id);
        sqlSession.commit();
        sqlSession.close();
        return re;
    }

    @Override
    public int updateSchoolAccountPassword(SchoolAccount schoolAccount) { //修改密码
        SqlSession sqlSession = getSession();
        int row = sqlSession.update("updateSchoolAccount", schoolAccount);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }

    @Override
    public int deleteSchoolAccountByAccountId(Integer account_id) { //根据ID删除账号
        SqlSession sqlSession = getSession();
        int row = sqlSession.update("deleteSchoolAccountByAccountId", account_id);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }
}
