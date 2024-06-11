package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_TW_W;

import java.util.Date;
import java.util.List;

public interface GS_TW_WService {
    GS_TW_W getByPrimaryKey(String twCd, Date tm);

    int modifyByPrimaryKey(GS_TW_W item);

    int add(GS_TW_W item);

    List<GS_TW_W> getAll();
}
