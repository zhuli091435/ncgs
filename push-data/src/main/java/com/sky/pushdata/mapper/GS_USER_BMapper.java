package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_USER_B;
import java.util.List;

public interface GS_USER_BMapper {
    int deleteByPrimaryKey(String ID);

    int insert(GS_USER_B row);

    GS_USER_B selectByPrimaryKey(String ID);

    List<GS_USER_B> selectAll();

    int updateByPrimaryKey(GS_USER_B row);
}