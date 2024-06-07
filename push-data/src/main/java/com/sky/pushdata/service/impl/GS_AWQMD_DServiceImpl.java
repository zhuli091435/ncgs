package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_AWQMD_DMapper;
import com.sky.pushdata.pojo.GS_AWQMD_D;
import com.sky.pushdata.service.GS_AWQMD_DService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GS_AWQMD_DServiceImpl implements GS_AWQMD_DService {
    @Resource
    private GS_AWQMD_DMapper gsAwqmdDMapper;

    @Override
    public GS_AWQMD_D getByPrimaryKey(String stcd, Date spt) {
        return gsAwqmdDMapper.selectByPrimaryKey(stcd, spt);
    }

    @Override
    public int modifyByPrimaryKey(GS_AWQMD_D item) {
        return gsAwqmdDMapper.updateByPrimaryKey(item);
    }

    @Override
    public int add(GS_AWQMD_D item) {
        return gsAwqmdDMapper.insert(item);
    }
}
