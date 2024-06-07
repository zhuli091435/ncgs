package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_AT_D;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GS_AT_DMapper {
    int deleteByPrimaryKey(@Param("TW_CD") String TW_CD, @Param("BDATE") String BDATE, @Param("ATN") String ATN);

    int insert(GS_AT_D row);

    GS_AT_D selectByPrimaryKey(@Param("TW_CD") String TW_CD, @Param("BDATE") String BDATE, @Param("ATN") String ATN);

    List<GS_AT_D> selectAll();

    int updateByPrimaryKey(GS_AT_D row);
}