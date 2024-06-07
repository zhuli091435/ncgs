package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_NMISP_DMapper;
import com.sky.pushdata.pojo.GS_NMISP_D;
import com.sky.pushdata.service.GS_NMISP_DService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class GS_NMISP_DServiceImpl implements GS_NMISP_DService {
    @Resource
    private GS_NMISP_DMapper gsNmispDMapper;

    @Override
    public GS_NMISP_D getByPrimaryKey(String rpCd) {
        return gsNmispDMapper.selectByPrimaryKey(rpCd);
    }

    @Override
    public int modifyByPrimaryKey(GS_NMISP_D item) {
        return gsNmispDMapper.updateByPrimaryKey(item);
    }

    @Override
    public int add(GS_NMISP_D item) {
        return gsNmispDMapper.insert(item);
    }
}
