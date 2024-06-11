package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_AAACP_D;

import java.util.List;

public interface GS_AAACP_DService {
    GS_AAACP_D getByPrimaryKey(String rpCd);

    int modifyByPrimaryKey(GS_AAACP_D item);

    int add(GS_AAACP_D item);

    List<GS_AAACP_D> getAll();
}
