package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_OPCP_DMapper;
import com.sky.pushdata.pojo.GS_OPCP_D;
import com.sky.pushdata.service.GS_OPCP_DService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GS_OPCP_DServiceImpl implements GS_OPCP_DService {
    @Resource
    private GS_OPCP_DMapper gsOpcpDMapper;

    @Override
    public GS_OPCP_D getByPrimaryKey(String rpCd) {
        return gsOpcpDMapper.selectByPrimaryKey(rpCd);
    }

    @Override
    public int modifyByPrimaryKey(GS_OPCP_D item) {
        return gsOpcpDMapper.updateByPrimaryKey(item);
    }

    @Override
    public int add(GS_OPCP_D item) {
        return gsOpcpDMapper.insert(item);
    }

    @Override
    public List<GS_OPCP_D> getAll() {
        return gsOpcpDMapper.selectAll();
    }
}
