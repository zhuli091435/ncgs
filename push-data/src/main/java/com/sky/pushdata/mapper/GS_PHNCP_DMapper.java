package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_PHNCP_D;
import java.util.Date;
import java.util.List;

public interface GS_PHNCP_DMapper {
    int deleteByPrimaryKey(Date SPT);

    int insert(GS_PHNCP_D row);

    GS_PHNCP_D selectByPrimaryKey(Date SPT);

    List<GS_PHNCP_D> selectAll();

    int updateByPrimaryKey(GS_PHNCP_D row);
}