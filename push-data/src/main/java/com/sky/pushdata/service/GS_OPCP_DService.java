package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_OPCP_D;

import java.util.List;

public interface GS_OPCP_DService {
    GS_OPCP_D getByPrimaryKey(String rpCd);

    int modifyByPrimaryKey(GS_OPCP_D item);

    int add(GS_OPCP_D item);

    List<GS_OPCP_D> getAll();
}
