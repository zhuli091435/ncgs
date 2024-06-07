package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_OPCP_D;

public interface GS_OPCP_DService {
    GS_OPCP_D getByPrimaryKey(String rpCd);

    int modifyByPrimaryKey(GS_OPCP_D item);

    int add(GS_OPCP_D item);
}
