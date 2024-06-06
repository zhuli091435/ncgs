package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_STAT_B;

public interface GS_STAT_BService {
    GS_STAT_B getByPrimaryKey(String stcd, String stNm);

    int modifyByPrimaryKey(GS_STAT_B item);

    int add(GS_STAT_B item);
}
