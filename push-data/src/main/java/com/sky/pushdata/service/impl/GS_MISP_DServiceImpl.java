package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_MISP_DMapper;
import com.sky.pushdata.pojo.GS_MISP_D;
import com.sky.pushdata.service.GS_MISP_DService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GS_MISP_DServiceImpl implements GS_MISP_DService {

    @Resource
    private GS_MISP_DMapper gsMispDMapper;

    @Override
    public GS_MISP_D getByPrimaryKey(String rpCd) {
        return gsMispDMapper.selectByPrimaryKey(rpCd);
    }

    @Override
    public int modifyByPrimaryKey(GS_MISP_D item) {
        return gsMispDMapper.updateByPrimaryKey(item);
    }

    @Override
    public int add(GS_MISP_D item) {
        return gsMispDMapper.insert(item);
    }

    @Override
    public List<GS_MISP_D> getAll() {
        return gsMispDMapper.selectAll();
    }
}
