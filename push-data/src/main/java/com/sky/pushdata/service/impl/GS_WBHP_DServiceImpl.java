package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_WBHP_DMapper;
import com.sky.pushdata.pojo.GS_WBHP_D;
import com.sky.pushdata.service.GS_WBHP_DService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class GS_WBHP_DServiceImpl implements GS_WBHP_DService {

    @Resource
    private GS_WBHP_DMapper gsWbhpDMapper;

    @Override
    public GS_WBHP_D getByPrimaryKey(String rpCd) {
        return gsWbhpDMapper.selectByPrimaryKey(rpCd);
    }

    @Override
    public int modifyByPrimaryKey(GS_WBHP_D item) {
        return gsWbhpDMapper.updateByPrimaryKey(item);
    }

    @Override
    public int add(GS_WBHP_D item) {
        return gsWbhpDMapper.insert(item);
    }

    @Override
    public List<GS_WBHP_D> getAll() {
        return gsWbhpDMapper.selectAll();
    }
}
