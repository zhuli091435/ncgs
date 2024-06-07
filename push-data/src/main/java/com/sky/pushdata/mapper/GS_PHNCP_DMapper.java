package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_PHNCP_D;
import java.util.List;

public interface GS_PHNCP_DMapper {
    int deleteByPrimaryKey(String RP_CD);

    int insert(GS_PHNCP_D row);

    GS_PHNCP_D selectByPrimaryKey(String RP_CD);

    List<GS_PHNCP_D> selectAll();

    int updateByPrimaryKey(GS_PHNCP_D row);
}