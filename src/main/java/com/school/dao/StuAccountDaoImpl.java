package com.school.dao;

import com.school.entity.StuAccount;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;

@Repository("stuAccountDao")
public class StuAccountDaoImpl implements StuAccountDao {
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
    public int addStuAccount(StuAccount stuAccount) {
        SqlSession sqlSession = getSession();
        int row = sqlSession.insert("addStuAccount", stuAccount);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }

    @Override
    public StuAccount findStuAccountByStuId(Integer stu_id) {
        SqlSession sqlSession = getSession();
        return sqlSession.selectOne("findStuAccountByStuId", stu_id);
    }

    @Override
    public StuAccount findStuAccountByEmail(String e_mail) {
        SqlSession sqlSession = getSession();
        return sqlSession.selectOne("findStuAccountByEmail", e_mail);
    }

    @Override
    public int updateStuAccountPassowrd(StuAccount stuAccount) {
        SqlSession sqlSession = getSession();
        int row = sqlSession.update("updateStuAccountPassword", stuAccount);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }

    @Override
    public int deleteStuAccountByStuId(Integer stu_id) {
        SqlSession sqlSession = getSession();
        int row = sqlSession.delete("deleteStuAccount", stu_id);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }


}
