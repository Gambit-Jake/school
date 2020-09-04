package com.school.service;

import com.school.entity.Department;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @Author: ZWP
 * @Date: 2020/8/28 15:01
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */
public class DepartmentServiceImplTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
    DepartmentService departmentService = applicationContext.getBean("departmentService", DepartmentService.class);

    @Test
    public void updateDepartment() {
        Department department = new Department();
        department.setDepartment_id(13);
        department.setAuthority(2);
        department.setTemplate(1);
        departmentService.updateDepartment(department);
    }
}