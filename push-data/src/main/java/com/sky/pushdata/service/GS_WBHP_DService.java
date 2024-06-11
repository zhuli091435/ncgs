package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_WBHP_D;

import java.util.List;

public interface GS_WBHP_DService {
    GS_WBHP_D getByPrimaryKey(String rpCd);

    int modifyByPrimaryKey(GS_WBHP_D item);

    int add(GS_WBHP_D item);

    List<GS_WBHP_D> getAll();
}
