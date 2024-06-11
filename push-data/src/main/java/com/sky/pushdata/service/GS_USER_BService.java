package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_AT_W;
import com.sky.pushdata.pojo.GS_USER_B;

import java.util.List;

public interface GS_USER_BService {
    GS_USER_B getByPrimaryKey(String id);

    int modifyByPrimaryKey(GS_USER_B item);

    int add(GS_USER_B item);

    List<GS_USER_B> getAll();
}
