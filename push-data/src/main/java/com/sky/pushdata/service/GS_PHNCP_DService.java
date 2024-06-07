package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_PHNCP_D;

public interface GS_PHNCP_DService {
    GS_PHNCP_D getByPrimaryKey(String rpCd);

    int modifyByPrimaryKey(GS_PHNCP_D item);

    int add(GS_PHNCP_D item);
}
