package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_AAACP_D;

public interface GS_AAACP_DService {
    GS_AAACP_D getByPrimaryKey(String rpCd);

    int modifyByPrimaryKey(GS_AAACP_D item);

    int add(GS_AAACP_D item);
}
