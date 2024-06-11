package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_NMISP_D;

import java.util.List;

public interface GS_NMISP_DService {
    GS_NMISP_D getByPrimaryKey(String rpCd);

    int modifyByPrimaryKey(GS_NMISP_D item);

    int add(GS_NMISP_D item);

    List<GS_NMISP_D> getAll();
}
