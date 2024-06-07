package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_AWQMD_D;

import java.util.Date;

public interface GS_AWQMD_DService {
    GS_AWQMD_D getByPrimaryKey(String stcd, Date spt);

    int modifyByPrimaryKey(GS_AWQMD_D item);

    int add(GS_AWQMD_D item);
}
