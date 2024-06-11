package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_AAACP_DMapper;
import com.sky.pushdata.pojo.GS_AAACP_D;
import com.sky.pushdata.service.GS_AAACP_DService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GS_AAACP_DServiceImpl implements GS_AAACP_DService {

    @Resource
    private GS_AAACP_DMapper gsAaacpDMapper;

    @Override
    public GS_AAACP_D getByPrimaryKey(String rpCd) {
        return gsAaacpDMapper.selectByPrimaryKey(rpCd);
    }

    @Override
    public int modifyByPrimaryKey(GS_AAACP_D item) {
        return gsAaacpDMapper.updateByPrimaryKey(item);
    }

    @Override
    public int add(GS_AAACP_D item) {
        return gsAaacpDMapper.insert(item);
    }

    @Override
    public List<GS_AAACP_D> getAll() {
        return gsAaacpDMapper.selectAll();
    }
}
