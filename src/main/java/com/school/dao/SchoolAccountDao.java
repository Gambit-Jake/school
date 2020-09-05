package com.school.dao;

import com.school.entity.SchoolAccount;

public interface SchoolAccountDao {
    int addSchoolAccount(SchoolAccount schoolAccount);

    SchoolAccount findSchoolAccountByAccountId(Integer account_id);

    int updateSchoolAccountPassword(SchoolAccount schoolAccount);

    int deleteSchoolAccountByAccountId(Integer account_id);
}
