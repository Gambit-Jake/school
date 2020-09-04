package com.school.entity;

/**
 * @Author: ZWP
 * @Date: 2020/8/24 15:04
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */
public class Log {
    Integer id;
    String content;

    public Log() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
