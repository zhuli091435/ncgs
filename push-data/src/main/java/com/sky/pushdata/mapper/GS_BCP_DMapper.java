package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_BCP_D;
import java.util.List;

public interface GS_BCP_DMapper {
    int deleteByPrimaryKey(String RP_CD);

    int insert(GS_BCP_D row);

    GS_BCP_D selectByPrimaryKey(String RP_CD);

    List<GS_BCP_D> selectAll();

    int updateByPrimaryKey(GS_BCP_D row);
}