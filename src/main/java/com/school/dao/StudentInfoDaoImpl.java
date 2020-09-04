package com.school.dao;

import com.school.entity.StudentInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Repository("studentInfoDao")
public class StudentInfoDaoImpl implements StudentInfoDao {
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
    public int addStudentInfo(StudentInfo studentInfo) {
        SqlSession sqlSession = getSession();
        int row = sqlSession.insert("addStudentInfo", studentInfo);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }

    @Override
    public StudentInfo findStudentInfoById(int stuId) {
        SqlSession sqlSession = getSession();
        StudentInfo studentInfo = sqlSession.selectOne("findStudentInfoById", stuId);
        sqlSession.close();
        return studentInfo;
    }

    @Override
    public List<StudentInfo> findAll() {
        SqlSession sqlSession = getSession();
        List<StudentInfo> list = sqlSession.selectList("findAll");
        sqlSession.close();
        return list;
    }

    @Override
    public int deleteStudentInfo(StudentInfo studentInfo) {
        SqlSession sqlSession = getSession();
        int delete = sqlSession.delete("deleteStudentInfo", studentInfo);
        sqlSession.commit();
        sqlSession.close();
        return delete;

    }

    @Override
    public int updateStudentInfo(StudentInfo studentInfo) {
        SqlSession sqlSession = getSession();
        int update = sqlSession.update("updateStudentInfo", studentInfo);
        sqlSession.commit();
        sqlSession.close();
        return update;
    }
}
