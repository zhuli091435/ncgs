package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_MOOOP_D;
import java.util.Date;
import java.util.List;

public interface GS_MOOOP_DMapper {
    int deleteByPrimaryKey(Date SPT);

    int insert(GS_MOOOP_D row);

    GS_MOOOP_D selectByPrimaryKey(Date SPT);

    List<GS_MOOOP_D> selectAll();

    int updateByPrimaryKey(GS_MOOOP_D row);
}