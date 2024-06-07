package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_AT_DMapper;
import com.sky.pushdata.pojo.GS_AT_D;
import com.sky.pushdata.service.GS_AT_DService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class GS_AT_DServiceImpl implements GS_AT_DService {

    @Resource
    private GS_AT_DMapper gsAtDMapper;

    @Override
    public GS_AT_D getByPrimaryKey(String twCd, String bdate, String atn) {
        return gsAtDMapper.selectByPrimaryKey(twCd, bdate, atn);
    }

    @Override
    public int modifyByPrimaryKey(GS_AT_D item) {
        return gsAtDMapper.updateByPrimaryKey(item);
    }

    @Override
    public int add(GS_AT_D item) {
        return gsAtDMapper.insert(item);
    }
}
