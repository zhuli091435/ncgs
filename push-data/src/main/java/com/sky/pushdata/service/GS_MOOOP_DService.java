package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_MOOOP_D;

public interface GS_MOOOP_DService {
    GS_MOOOP_D getByPrimaryKey(String rpCd);

    int modifyByPrimaryKey(GS_MOOOP_D item);

    int add(GS_MOOOP_D item);
}
