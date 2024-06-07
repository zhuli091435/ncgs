package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_STAT_B;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GS_STAT_BMapper {
    int deleteByPrimaryKey(@Param("STCD") String STCD, @Param("ST_NM") String ST_NM);

    int insert(GS_STAT_B row);

    GS_STAT_B selectByPrimaryKey(@Param("STCD") String STCD, @Param("ST_NM") String ST_NM);

    List<GS_STAT_B> selectAll();

    int updateByPrimaryKey(GS_STAT_B row);
}