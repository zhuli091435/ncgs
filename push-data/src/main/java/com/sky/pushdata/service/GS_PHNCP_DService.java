package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_PHNCP_D;

import java.util.List;

public interface GS_PHNCP_DService {
    GS_PHNCP_D getByPrimaryKey(String rpCd);

    int modifyByPrimaryKey(GS_PHNCP_D item);

    int add(GS_PHNCP_D item);

    List<GS_PHNCP_D> getAll();
}
