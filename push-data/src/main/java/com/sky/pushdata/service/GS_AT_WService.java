package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_AT_W;

import java.util.List;

public interface GS_AT_WService {
    int modifyByPrimaryKey(GS_AT_W item);

    int add(GS_AT_W item);

    GS_AT_W getByPrimaryKey(String atn);

    List<GS_AT_W> getAll();
}
