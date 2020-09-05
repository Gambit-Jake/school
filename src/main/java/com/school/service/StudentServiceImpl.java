package com.school.service;

import com.school.dao.StudentInfoDao;
import com.school.entity.StudentInfo;
import com.school.utils.LogUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: ZWP
 * @Date: 2020/8/28 14:15
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource(name = "studentInfoDao")
    StudentInfoDao studentInfoDao;

    @Resource(name = "logUtils")
    LogUtils logUtils;

    @Override
    public List<StudentInfo> findAllStudent() {
        logUtils.logPrint("service", "查找所有的学生", "查找成功");
        return studentInfoDao.findAll();
    }

    @Override
    public StudentInfo updateStudent(StudentInfo studentInfo) {

        int row = studentInfoDao.updateStudentInfo(studentInfo);
        if (row == 1)
            logUtils.logPrint("service", "更新学生信息学生", "更新成功");
        else
            logUtils.logPrint("service", "更新学生信息学生", "更新失败");
        return studentInfo;


    }

    @Override
    public int deleteStudent(Integer student_id) {


        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setStu_id(student_id);
        int row = studentInfoDao.deleteStudentInfo(studentInfo);
        if (row == 1)
            logUtils.logPrint("service", "删除学生信息学生", "删除成功");
        else
            logUtils.logPrint("service", "删除学生信息学生", "删除失败");
        return row;
    }
}
