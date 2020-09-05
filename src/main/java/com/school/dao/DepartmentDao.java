package com.school.dao;

import com.school.entity.Department;

public interface DepartmentDao {
    int insertDepartment(Department department);

    int updateDepartment(Department department);

    int deleteDepartmentByDepId(Integer department_id);

    Department findDepartmentByDepId(Integer department_id);
}
