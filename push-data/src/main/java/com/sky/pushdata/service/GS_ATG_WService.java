package com.sky.pushdata.service;

import com.sky.pushdata.pojo.GS_ATG_W;

import java.util.Date;

public interface GS_ATG_WService {
    GS_ATG_W getByPrimaryKey(String twCd, Date starttm, Date endtm);

    int modifyByPrimaryKey(GS_ATG_W item);

    int add(GS_ATG_W item);
}
