package com.school.service;

import com.school.entity.Course;

import java.util.List;

public interface CourseService {
    Course findCourseById(int course_id);
    List<Course> findCourseByName(String course_name);
    List<Course> findCourseByTerm(String term);
    List<Course> findAllCourse();
    int addCourseRecord(Course course);
}
