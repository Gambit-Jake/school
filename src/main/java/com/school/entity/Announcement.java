package com.school.entity;

/**
 * @Author: ZWP
 * @Date: 2020/8/24 14:58
 * @description: TODO
 * @modifiedBy:
 * @version: 1.0
 */
public class Announcement {
    Integer ann_id;
    Integer department_id;
    Integer ann_type;
    String ann_title;
    String ann_content;
    Integer ann_time;

    public Announcement() {
    }

    public Integer getAnn_id() {
        return ann_id;
    }

    public void setAnn_id(Integer ann_id) {
        this.ann_id = ann_id;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public Integer getAnn_type() {
        return ann_type;
    }

    public void setAnn_type(Integer ann_type) {
        this.ann_type = ann_type;
    }

    public String getAnn_title() {
        return ann_title;
    }

    public void setAnn_title(String ann_title) {
        this.ann_title = ann_title;
    }

    public String getAnn_content() {
        return ann_content;
    }

    public void setAnn_content(String ann_content) {
        this.ann_content = ann_content;
    }

    public Integer getAnn_time() {
        return ann_time;
    }

    public void setAnn_time(Integer ann_time) {
        this.ann_time = ann_time;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "ann_id=" + ann_id +
                ", department_id='" + department_id + '\'' +
                ", ann_type=" + ann_type +
                ", ann_title='" + ann_title + '\'' +
                ", ann_content='" + ann_content + '\'' +
                ", ann_time=" + ann_time +
                '}';
    }
}
