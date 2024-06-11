package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_MOOOP_D;

import java.util.List;

public interface GS_MOOOP_DService {
    GS_MOOOP_D getByPrimaryKey(String rpCd);

    int modifyByPrimaryKey(GS_MOOOP_D item);

    int add(GS_MOOOP_D item);

    List<GS_MOOOP_D> getAll();
}
