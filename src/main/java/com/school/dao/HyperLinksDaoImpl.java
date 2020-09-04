package com.school.dao;

import com.school.entity.HyperLinks;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.io.IOException;
import java.io.InputStream;
@Repository("hyperlinksDao")
public class HyperLinksDaoImpl implements HyperLinksDao {
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
    static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
    public int insertHyperLinks(HyperLinks hyperLinks)
    {
        SqlSession sqlSession = getSession();
        int row = sqlSession.insert("insertHyperLinks",hyperLinks);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }
    public int updateHyperLinks(HyperLinks hyperLinks){
        SqlSession sqlSession = getSession();
        int row = sqlSession.update("updateHyperLinks",hyperLinks);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }

    public int deleteHyperLinksByFuncId(Integer function_id){
        SqlSession sqlSession = getSession();
        int row = sqlSession.delete("deleteHyperLinksByFuncId",function_id);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }
    public HyperLinks findHyperLinksByFuncId(Integer function_id){
        SqlSession sqlSession = getSession();
        return sqlSession.selectOne("findHyperLinksByFuncId",function_id);
    }
    public List<HyperLinks> findAllHyperLinks(){
        SqlSession sqlSession = getSession();
        return sqlSession.selectList("findAllHyperLinks");
    }
}
