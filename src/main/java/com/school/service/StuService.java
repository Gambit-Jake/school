package com.school.service;

public interface StuService {
    int LoginStu(int account, String pwd);

    int LogoutStu(int account);

    int RegisterStu(int account, String pwd, String email);

    int ChangePwdStu(int account, String oldPwd, String newPwd);
}
