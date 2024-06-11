package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_PHNCP_DMapper;
import com.sky.pushdata.pojo.GS_PHNCP_D;
import com.sky.pushdata.service.GS_PHNCP_DService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GS_PHNCP_DServiceImpl implements GS_PHNCP_DService {
    @Resource
    private GS_PHNCP_DMapper gsPhncpDMapper;

    @Override
    public GS_PHNCP_D getByPrimaryKey(String rpCd) {
        return gsPhncpDMapper.selectByPrimaryKey(rpCd);
    }

    @Override
    public int modifyByPrimaryKey(GS_PHNCP_D item) {
        return gsPhncpDMapper.updateByPrimaryKey(item);
    }

    @Override
    public int add(GS_PHNCP_D item) {
        return gsPhncpDMapper.insert(item);
    }

    @Override
    public List<GS_PHNCP_D> getAll() {
        return gsPhncpDMapper.selectAll();
    }
}
