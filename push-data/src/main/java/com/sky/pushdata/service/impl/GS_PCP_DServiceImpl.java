package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_PCP_DMapper;
import com.sky.pushdata.pojo.GS_PCP_D;
import com.sky.pushdata.service.GS_PCP_DService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class GS_PCP_DServiceImpl implements GS_PCP_DService {
    @Resource
    private GS_PCP_DMapper gsPcpDMapper;

    @Override
    public GS_PCP_D getByPrimaryKey(String rpCd) {
        return gsPcpDMapper.selectByPrimaryKey(rpCd);
    }

    @Override
    public int modifyByPrimaryKey(GS_PCP_D item) {
        return gsPcpDMapper.updateByPrimaryKey(item);
    }

    @Override
    public int add(GS_PCP_D item) {
        return gsPcpDMapper.insert(item);
    }
}
