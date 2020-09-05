package com.school.entity;

public class StugradeDTO {
    Integer stu_id;
    Integer course_id;
    String course_name;
    Float credit;
    String term;
    String course_type;
    Float score;

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Integer getStu_id() {
        return stu_id;
    }

    public void setStu_id(Integer stu_id) {
        this.stu_id = stu_id;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getCourse_type() {
        return course_type;
    }

    public void setCourse_type(String course_type) {
        this.course_type = course_type;
    }

    @Override
    public String toString() {
        return "StugradeDTO{" +
                "stu_id=" + stu_id +
                ", course_id=" + course_id +
                ", course_name='" + course_name + '\'' +
                ", credit=" + credit +
                ", term='" + term + '\'' +
                ", course_type='" + course_type + '\'' +
                ", score=" + score +
                '}';
    }
}
