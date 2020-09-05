package com.school.service;

import com.school.dao.LogDao;
import com.school.utils.LogUtils;
import org.aspectj.bridge.Message;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.*;

/**
 * @Author: ZWP
 * @Date: 2020/8/28 10:08
 * @description: TODO(实现了学校信息的读写)
 * @modifiedBy:
 * @version: 1.0
 */
@Service("messageService")
public class MessageServiceImpl implements MessageService {

    @Resource(name = "logUtils")
    LogUtils logUtils;

    static String messagePath = "src/main/java/com/school/files/message.txt";

    @Override
    public String getMassage() {//获取机构信息
        String Message = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(messagePath));
            String ContentLine = bufferedReader.readLine();
            Message = "";
            while (ContentLine != null) {
                Message = Message + ContentLine;
                ContentLine = bufferedReader.readLine();
                System.out.println(ContentLine);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        logUtils.logPrint("Service", "读出机构信息", "读出成功");
        return Message;
    }

    @Override
    public boolean setMassage(String message) {//写入机构信息
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(messagePath));
            bufferedWriter.write(message);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        logUtils.logPrint("Service", "写入机构信息", "写入成功");
        return true;
    }
}
