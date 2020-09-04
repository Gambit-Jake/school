package com.school.service;

import com.school.dao.CourseDao;
import com.school.entity.Course;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

    @Resource(name = "courseDao")
    CourseDao courseDao;

    /*
    根据课程id寻找课程记录，返回一条课程记录
     */
    @Override
    public Course findCourseById(int course_id) {
        Course course = this.courseDao.findCourseById(course_id);
        return course;
    }

    /*
    根据课程名称寻找课程记录，返回具有同一课程名称的课程记录列表
     */
    @Override
    public List<Course> findCourseByName(String course_name) {
        List<Course> courses = this.courseDao.findCourseByName(course_name);
        return courses;
    }

    /*
    根据课程开设学期寻找课程记录，返回在同一学期开设的课程记录列表
     */
    @Override
    public List<Course> findCourseByTerm(String term) {
        List<Course> courses = this.courseDao.findCourseByTerm(term);
        return courses;
    }

    /*
    返回所有的课程记录
     */
    @Override
    public List<Course> findAllCourse() {
        List<Course> courses = this.courseDao.findAllCourse();
        return courses;
    }

    /*
    添加一条课程记录，查找要添加的id是否与记录表格中的课程id冲突，若冲突则添加失败，返回0；否则添加成功，返回1
     */
    @Override
    public int addCourseRecord(Course course) {
        int newid = course.getCourse_id();
        Course course1 = this.courseDao.findCourseById(newid);
        if(course1 == null){
            this.courseDao.addCourse(course);
            return 1;
        }else return 0;
    }
}
