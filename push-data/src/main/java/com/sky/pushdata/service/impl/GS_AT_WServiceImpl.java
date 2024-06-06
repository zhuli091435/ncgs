package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_AT_WMapper;
import com.sky.pushdata.pojo.GS_AT_W;
import com.sky.pushdata.service.GS_AT_WService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class GS_AT_WServiceImpl implements GS_AT_WService {

    @Resource
    private GS_AT_WMapper gsAtWMapper;

    @Override
    public int modifyByPrimaryKey(GS_AT_W item) {
        return gsAtWMapper.updateByPrimaryKey(item);
    }

    @Override
    public int add(GS_AT_W item) {
        return gsAtWMapper.insert(item);
    }

    @Override
    public GS_AT_W getByPrimaryKey(String atn) {
        return gsAtWMapper.selectByPrimaryKey(atn);
    }
}
