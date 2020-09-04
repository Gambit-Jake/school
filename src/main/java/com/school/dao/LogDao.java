package com.school.dao;

import com.school.entity.Announcement;
import com.school.entity.Log;

import java.util.List;

/**
 * @Author: ZWP
 * @Date: 2020/8/24 13:07
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */
public interface LogDao {
    int addLog(Log log);

    List<Log> findAllLog();


}
