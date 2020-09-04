package com.school.service;

import com.school.dao.DepartmentDao;
import com.school.entity.Department;
import com.school.utils.LogUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: ZWP
 * @Date: 2020/8/28 10:47
 * @description: TODO(实现了对于学院的操作)
 * @modifiedBy:
 * @version: 1.0
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Resource(name = "departmentDao")
    DepartmentDao departmentDao;

    @Resource(name = "logUtils")
    LogUtils logUtils;

    @Override
    public int updateDepartment(Department department) {//用于修改权限的函数
        int row = departmentDao.updateDepartment(department);
        if (row == 1)
            logUtils.logPrint("service", "修改权限", "成功");
        else
            logUtils.logPrint("service", "修改权限", "失败");
        return row;
    }

    public Department findDepartmentById(Integer id){
        logUtils.logPrint("service", "找学院啊", "成功");
        return departmentDao.findDepartmentByDepId(id);
    }
}
