package com.school.service;


import com.school.dao.StuAccountDao;
import com.school.entity.StuAccount;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("stuService")
public class StuServiceImp implements StuService {

    @Resource(name = "stuAccountDao")
    StuAccountDao stuAccountDao;

    /*
    查询对应学生账号密码是否正确，返回对应信息：-1表示未找到对应账号；0表示密码不正确；1表示密码正确，登录成功。
     */
    @Override
    public int LoginStu(int account, String pwd) {
        StuAccount stuAccount = this.stuAccountDao.findStuAccountByStuId(account);
        if (stuAccount == null)
            return -1;
        else if (stuAccount.getPassword().equals(pwd))
            return 1;
        else
            return 0;
    }

    /*
    学生账户登出，返回1表示登出成功。
     */
    @Override
    public int LogoutStu(int account) {
        return 1;
    }

    /*
    注册学生账户，先查询是否已有相同账户，返回对应信息：0表示已有相同账户，注册失败；1表示注册成功。
     */
    @Override
    public int RegisterStu(int account, String pwd, String email) {
        StuAccount stuAccount = this.stuAccountDao.findStuAccountByStuId(account);
        if (stuAccount == null) {
            StuAccount stuAccount1 = new StuAccount();
            stuAccount1.setStu_id(account);
            stuAccount1.setPassword(pwd);
            stuAccount1.setE_mail(email);
            this.stuAccountDao.addStuAccount(stuAccount1);
            return 1;
        } else
            return 0;
    }

    /*
    根据学生账号和旧密码选择对应记录，将旧密码改成新密码，返回对应信息：0表示旧密码不正确，修改密码失败；1表示修改密码成功。
     */
    @Override
    public int ChangePwdStu(int account, String oldPwd, String newPwd) {
        StuAccount stuAccount = this.stuAccountDao.findStuAccountByStuId(account);
        if (stuAccount.getPassword().equals(oldPwd)) {
            stuAccount.setPassword(newPwd);
            this.stuAccountDao.updateStuAccountPassowrd(stuAccount);
            return 1;
        } else
            return 0;
    }
}
