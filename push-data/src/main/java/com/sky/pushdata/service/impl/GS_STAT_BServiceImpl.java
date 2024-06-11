package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_STAT_BMapper;
import com.sky.pushdata.pojo.GS_STAT_B;
import com.sky.pushdata.service.GS_STAT_BService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GS_STAT_BServiceImpl implements GS_STAT_BService {

    @Resource
    private GS_STAT_BMapper gsStatBMapper;

    @Override
    public GS_STAT_B getByPrimaryKey(String stcd, String stNm) {
        return gsStatBMapper.selectByPrimaryKey(stcd, stNm);
    }

    @Override
    public int modifyByPrimaryKey(GS_STAT_B item) {
        return gsStatBMapper.updateByPrimaryKey(item);
    }

    @Override
    public int add(GS_STAT_B item) {
        return gsStatBMapper.insert(item);
    }

    @Override
    public List<GS_STAT_B> getAll() {
        return gsStatBMapper.selectAll();
    }
}
