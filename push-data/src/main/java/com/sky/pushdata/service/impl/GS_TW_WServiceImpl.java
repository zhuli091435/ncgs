package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_TW_WMapper;
import com.sky.pushdata.pojo.GS_TW_W;
import com.sky.pushdata.service.GS_TW_WService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GS_TW_WServiceImpl implements GS_TW_WService {

    @Resource
    private GS_TW_WMapper gsTwWMapper;

    @Override
    public GS_TW_W getByPrimaryKey(String twCd, Date tm) {
        return gsTwWMapper.selectByPrimaryKey(twCd, tm);
    }

    @Override
    public int modifyByPrimaryKey(GS_TW_W item) {
        return gsTwWMapper.updateByPrimaryKey(item);
    }

    @Override
    public int add(GS_TW_W item) {
        return gsTwWMapper.insert(item);
    }

    @Override
    public List<GS_TW_W> getAll() {
        return gsTwWMapper.selectAll();
    }
}
