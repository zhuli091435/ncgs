package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_TW_B;

import java.util.List;

public interface GS_TW_BService {
    GS_TW_B getByTW_CD(String twCd);

    int modifyByTW_CD(GS_TW_B item);

    List<GS_TW_B> getAll();
}
