package com.sky.pushdata.service.impl;

import com.sky.pushdata.mapper.GS_STAT_BMapper;
import com.sky.pushdata.mapper.GS_TW_BMapper;
import com.sky.pushdata.pojo.GS_TW_B;
import com.sky.pushdata.service.GS_TW_BService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GS_TW_BServiceImpl implements GS_TW_BService {
    @Resource
    private GS_TW_BMapper gs_tw_bMapper;

    @Override
    public GS_TW_B getByTW_CD(String twCd) {
        return gs_tw_bMapper.getByTW_CD(twCd);
    }

    @Override
    public int modifyByTW_CD(GS_TW_B item) {
        return gs_tw_bMapper.modifyByTW_CD(item);
    }

    @Override
    public List<GS_TW_B> getAll() {
        return gs_tw_bMapper.selectAll();
    }
}
