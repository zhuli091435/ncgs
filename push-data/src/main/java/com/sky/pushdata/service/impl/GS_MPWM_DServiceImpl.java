package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_MPWM_DMapper;
import com.sky.pushdata.pojo.GS_MPWM_D;
import com.sky.pushdata.service.GS_MPWM_DService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GS_MPWM_DServiceImpl implements GS_MPWM_DService {

    @Resource
    private GS_MPWM_DMapper gsMpwmDMapper;

    @Override
    public GS_MPWM_D getByPrimaryKey(String stcd, Date tm) {
        return gsMpwmDMapper.selectByPrimaryKey(stcd, tm);
    }

    @Override
    public int modifyByPrimaryKey(GS_MPWM_D item) {
        return gsMpwmDMapper.updateByPrimaryKey(item);
    }

    @Override
    public int add(GS_MPWM_D item) {
        return gsMpwmDMapper.insert(item);
    }
}
