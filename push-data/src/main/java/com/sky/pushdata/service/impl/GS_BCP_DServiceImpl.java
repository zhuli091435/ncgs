package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_BCP_DMapper;
import com.sky.pushdata.pojo.GS_BCP_D;
import com.sky.pushdata.service.GS_BCP_DService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GS_BCP_DServiceImpl implements GS_BCP_DService {
    @Resource
    private GS_BCP_DMapper gsBcpDMapper;

    @Override
    public GS_BCP_D getByPrimaryKey(String rpCd) {
        return gsBcpDMapper.selectByPrimaryKey(rpCd);
    }

    @Override
    public int modifyByPrimaryKey(GS_BCP_D item) {
        return gsBcpDMapper.updateByPrimaryKey(item);
    }

    @Override
    public int add(GS_BCP_D item) {
        return gsBcpDMapper.insert(item);
    }

    @Override
    public List<GS_BCP_D> getAll() {
        return gsBcpDMapper.selectAll();
    }
}
