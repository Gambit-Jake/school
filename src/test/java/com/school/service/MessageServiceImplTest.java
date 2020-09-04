package com.school.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: ZWP
 * @Date: 2020/8/28 15:02
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */
public class MessageServiceImplTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
    MessageService messageService = applicationContext.getBean("massageService", MessageService.class);
    @Test
    public void getMassage() {
        System.out.println(messageService.getMassage());
    }

    @Test
    public void setMassage() {
        messageService.setMassage("发啥快递附件是浪费和检查");
    }
}