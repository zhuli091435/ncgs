package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_MPWM_D;

import java.util.Date;

public interface GS_MPWM_DService {
    GS_MPWM_D getByPrimaryKey(String stcd, Date tm);

    int modifyByPrimaryKey(GS_MPWM_D item);

    int add(GS_MPWM_D item);
}
