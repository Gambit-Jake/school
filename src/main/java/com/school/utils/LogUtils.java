package com.school.utils;

import com.school.dao.LogDao;
import com.school.dao.LogDaoImpl;
import com.school.entity.Log;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: ZWP
 * @Date: 2020/8/24 19:56
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */
@Component("logUtils")
public class LogUtils {
    @Resource(name = "logDao")
    public LogDao logDao;

    public void logPrint(String type, String content, String result) {
        String logContent = "[" + type + "] " + "content: " + content + "  result: " + result;
        System.out.println(logContent);
        Log log = new Log();
        log.setId((int) (System.currentTimeMillis()));
        log.setContent(logContent);
        logDao.addLog(log);
    }
}
