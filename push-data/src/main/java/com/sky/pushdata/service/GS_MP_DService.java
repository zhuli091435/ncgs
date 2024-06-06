package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_MP_D;

import java.util.Date;

public interface GS_MP_DService {
    GS_MP_D getByPrimaryKey(String stcd, Date tm);

    int modifyByPrimaryKey(GS_MP_D item);

    int add(GS_MP_D item);
}
