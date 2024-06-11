package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_BCP_D;

import java.util.List;

public interface GS_BCP_DService {
    GS_BCP_D getByPrimaryKey(String rpCd);

    int modifyByPrimaryKey(GS_BCP_D item);

    int add(GS_BCP_D item);

    List<GS_BCP_D> getAll();
}
