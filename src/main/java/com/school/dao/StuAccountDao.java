package com.school.dao;

import com.school.entity.StuAccount;

public interface StuAccountDao {
    int addStuAccount(StuAccount stuAccount);

    StuAccount findStuAccountByStuId(Integer stu_id);

    StuAccount findStuAccountByEmail(String e_mail);

    int updateStuAccountPassowrd(StuAccount stuAccount);

    int deleteStuAccountByStuId(Integer stu_id);
}
