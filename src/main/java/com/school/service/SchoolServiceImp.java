package com.school.service;

import com.school.dao.SchoolAccountDao;
import com.school.entity.SchoolAccount;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("schoolService")
public class SchoolServiceImp implements SchoolService {

    @Resource(name = "schoolAccountDao")
    SchoolAccountDao schoolAccountDao;

    /*
    学校账户登录，根据账号和密码查询对应表格，返回相应信息：-1表示未找到对应账号；0表示密码不正确；1表示密码正确，登录成功。
     */
    @Override
    public int LoginSchool(int account, String pwd) {
        SchoolAccount schoolAccount = this.schoolAccountDao.findSchoolAccountByAccountId(account);
        if(schoolAccount == null) return -1;
        else if(schoolAccount.getPassword().equals(pwd)) return 1;
        else return 0;
    }
}
