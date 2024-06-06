package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_PCP_D;
import java.util.Date;
import java.util.List;

public interface GS_PCP_DMapper {
    int deleteByPrimaryKey(Date SPT);

    int insert(GS_PCP_D row);

    GS_PCP_D selectByPrimaryKey(Date SPT);

    List<GS_PCP_D> selectAll();

    int updateByPrimaryKey(GS_PCP_D row);
}