package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_AT_D;

public interface GS_AT_DService {
    GS_AT_D getByPrimaryKey(String twCd, String bdate, String atn);

    int modifyByPrimaryKey(GS_AT_D item);

    int add(GS_AT_D item);
}
