package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_PCP_D;
import java.util.List;

public interface GS_PCP_DMapper {
    int deleteByPrimaryKey(String RP_CD);

    int insert(GS_PCP_D row);

    GS_PCP_D selectByPrimaryKey(String RP_CD);

    List<GS_PCP_D> selectAll();

    int updateByPrimaryKey(GS_PCP_D row);
}