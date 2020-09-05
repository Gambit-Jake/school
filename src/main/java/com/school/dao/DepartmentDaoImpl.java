package com.school.dao;

import com.school.entity.Department;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;

@Repository("departmentDao")
public class DepartmentDaoImpl implements DepartmentDao {
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

    public int insertDepartment(Department department) {
        SqlSession sqlSession = getSession();
        int row = sqlSession.insert("insertDepartment", department);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }

    public int updateDepartment(Department department) {
        SqlSession sqlSession = getSession();
        int row = sqlSession.update("updateDepartment", department);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }

    public int deleteDepartmentByDepId(Integer department_id) {
        SqlSession sqlSession = getSession();
        int row = sqlSession.delete("deleteDepartmentByDepId", department_id);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }

    public Department findDepartmentByDepId(Integer department_id) {
        SqlSession sqlSession = getSession();
        return sqlSession.selectOne("findDepartmentByDepId", department_id);
    }
}
