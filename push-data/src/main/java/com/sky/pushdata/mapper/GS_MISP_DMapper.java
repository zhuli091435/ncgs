package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_MISP_D;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GS_MISP_DMapper {
    int deleteByPrimaryKey(@Param("TW_CD") String TW_CD, @Param("SPT") Date SPT);

    int insert(GS_MISP_D row);

    GS_MISP_D selectByPrimaryKey(@Param("TW_CD") String TW_CD, @Param("SPT") Date SPT);

    List<GS_MISP_D> selectAll();

    int updateByPrimaryKey(GS_MISP_D row);
}