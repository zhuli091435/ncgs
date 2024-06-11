package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_PCP_D;

import java.util.List;

public interface GS_PCP_DService {
    GS_PCP_D getByPrimaryKey(String rpCd);

    int modifyByPrimaryKey(GS_PCP_D item);

    int add(GS_PCP_D item);

    List<GS_PCP_D> getAll();
}
