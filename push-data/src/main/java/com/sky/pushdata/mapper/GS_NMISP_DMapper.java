package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_NMISP_D;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GS_NMISP_DMapper {
    int deleteByPrimaryKey(@Param("RP_CD") String RP_CD, @Param("SPT") Date SPT);

    int insert(GS_NMISP_D row);

    GS_NMISP_D selectByPrimaryKey(@Param("RP_CD") String RP_CD, @Param("SPT") Date SPT);

    List<GS_NMISP_D> selectAll();

    int updateByPrimaryKey(GS_NMISP_D row);
}