package com.school.dao;

import com.school.entity.Course;

import java.util.List;

public interface CourseDao {
    int addCourse(Course course);
    Course findCourseById(Integer course_id);
    List<Course> findAllCourse();
    List<Course> findCourseByName(String course_name);
    List<Course> findCourseByTerm(String term);
    int updateCourse(Course course);
    int deleteCourse(Integer course_id);
}
