package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_MP_DMapper;
import com.sky.pushdata.pojo.GS_MP_D;
import com.sky.pushdata.service.GS_MP_DService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GS_MP_DServiceImpl implements GS_MP_DService {
    @Resource
    private GS_MP_DMapper gsMpDMapper;

    @Override
    public GS_MP_D getByPrimaryKey(String stcd, Date tm) {
        return gsMpDMapper.selectByPrimaryKey(stcd, tm);
    }

    @Override
    public int modifyByPrimaryKey(GS_MP_D item) {
        return gsMpDMapper.updateByPrimaryKey(item);
    }

    @Override
    public int add(GS_MP_D item) {
        return gsMpDMapper.insert(item);
    }

    @Override
    public List<GS_MP_D> getAll() {
        return gsMpDMapper.selectAll();
    }
}
