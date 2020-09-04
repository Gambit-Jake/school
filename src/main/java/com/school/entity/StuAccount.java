package com.school.entity;

public class StuAccount {
    Integer stu_id;
    String password;
    String e_mail;

    public StuAccount() {
    }

    public Integer getStu_id() {
        return stu_id;
    }

    public void setStu_id(Integer stu_id) {
        this.stu_id = stu_id;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "StuAccount{" +
                "stu_id=" + stu_id +
                ", password='" + password + '\'' +
                ", e_mail=" + e_mail + '\'' +
                '}';
    }
}
