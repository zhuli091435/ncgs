package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_MISP_D;

public interface GS_MISP_DService {
    GS_MISP_D getByPrimaryKey(String rpCd);

    int modifyByPrimaryKey(GS_MISP_D item);

    int add(GS_MISP_D item);
}
