package com.school.dao;

import com.school.entity.Stugrade;

import java.util.List;

/**
 * @Author: LHP
 * @Date: 2020/8/26 0:30
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */

public interface StugradeDao {
    int addStugrade(Stugrade stugrade);

    Stugrade findStugradeById(Integer stu_id);

    List<Stugrade> findAllStugrade();

    int updateStugrade(Stugrade stugrade);

    int deleteStugrade(Integer stu_id);
}
