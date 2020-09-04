package com.school.dao;

import com.school.entity.Course;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Repository("courseDao")
public class CourseDaoImpl implements CourseDao {
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
    public int addCourse(Course course) {
        SqlSession sqlSession = getSession();
        int row = sqlSession.insert("addCourse", course);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }

    @Override
    public Course findCourseById(Integer course_id) {
        SqlSession sqlSession = getSession();
        Course course = sqlSession.selectOne("findCourseById", course_id);
        sqlSession.commit();
        sqlSession.close();
        return course;
    }

    @Override
    public List<Course> findAllCourse() {
        SqlSession sqlSession = getSession();
        List<Course> courses = sqlSession.selectList("findAllCourse");
        sqlSession.commit();
        sqlSession.close();
        return courses;
    }

    @Override
    public List<Course> findCourseByName(String course_name) {
        SqlSession sqlSession = getSession();
        List<Course> courses = sqlSession.selectList("findCourseByName", course_name);
        sqlSession.commit();
        sqlSession.close();
        return courses;
    }

    @Override
    public List<Course> findCourseByTerm(String term) {
        SqlSession sqlSession = getSession();
        List<Course> courses = sqlSession.selectList("findCourseByTerm", term);
        sqlSession.commit();
        sqlSession.close();
        return courses;
    }

    @Override
    public int updateCourse(Course course) {
        SqlSession sqlSession = getSession();
        int row = sqlSession.update("updateCourse", course);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }

    @Override
    public int deleteCourse(Integer course_id) {
        SqlSession sqlSession = getSession();
        int row = sqlSession.delete("deleteCourse", course_id);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }
}
