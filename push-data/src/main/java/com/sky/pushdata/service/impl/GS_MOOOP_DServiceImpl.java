package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_MOOOP_DMapper;
import com.sky.pushdata.pojo.GS_MOOOP_D;
import com.sky.pushdata.service.GS_MOOOP_DService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class GS_MOOOP_DServiceImpl implements GS_MOOOP_DService {
    @Resource
    private GS_MOOOP_DMapper gsMooopDMapper;

    @Override
    public GS_MOOOP_D getByPrimaryKey(String rpCd) {
        return gsMooopDMapper.selectByPrimaryKey(rpCd);
    }

    @Override
    public int modifyByPrimaryKey(GS_MOOOP_D item) {
        return gsMooopDMapper.updateByPrimaryKey(item);
    }

    @Override
    public int add(GS_MOOOP_D item) {
        return gsMooopDMapper.insert(item);
    }
}
