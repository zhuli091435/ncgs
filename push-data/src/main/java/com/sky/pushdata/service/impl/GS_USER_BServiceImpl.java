package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_USER_BMapper;
import com.sky.pushdata.pojo.GS_AT_W;
import com.sky.pushdata.pojo.GS_USER_B;
import com.sky.pushdata.service.GS_USER_BService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GS_USER_BServiceImpl implements GS_USER_BService {

    @Resource
    private GS_USER_BMapper gsUserBMapper;

    @Override
    public GS_USER_B getByPrimaryKey(String id) {
        return gsUserBMapper.selectByPrimaryKey(id);
    }

    @Override
    public int modifyByPrimaryKey(GS_USER_B item) {
        return gsUserBMapper.updateByPrimaryKey(item);
    }

    @Override
    public int add(GS_USER_B item) {
        return gsUserBMapper.insert(item);
    }

    @Override
    public List<GS_USER_B> getAll() {
        return gsUserBMapper.selectAll();
    }
}
