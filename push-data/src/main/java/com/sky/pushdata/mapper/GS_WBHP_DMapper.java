package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_WBHP_D;
import java.util.Date;
import java.util.List;

public interface GS_WBHP_DMapper {
    int deleteByPrimaryKey(Date SPT);

    int insert(GS_WBHP_D row);

    GS_WBHP_D selectByPrimaryKey(Date SPT);

    List<GS_WBHP_D> selectAll();

    int updateByPrimaryKey(GS_WBHP_D row);
}