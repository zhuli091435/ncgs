package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_ATG_WMapper;
import com.sky.pushdata.pojo.GS_ATG_W;
import com.sky.pushdata.service.GS_ATG_WService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GS_ATG_WServiceImpl implements GS_ATG_WService {

    @Resource
    private GS_ATG_WMapper gsAtgWMapper;

    @Override
    public GS_ATG_W getByPrimaryKey(String twCd, Date starttm, Date endtm) {
        return gsAtgWMapper.selectByPrimaryKey(twCd, starttm, endtm);
    }

    @Override
    public int modifyByPrimaryKey(GS_ATG_W item) {
        return 0;
    }

    @Override
    public int add(GS_ATG_W item) {
        return 0;
    }
}
