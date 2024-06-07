package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_TW_W;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GS_TW_WMapper {
    int deleteByPrimaryKey(@Param("TW_CD") String TW_CD, @Param("TM") Date TM);

    int insert(GS_TW_W row);

    GS_TW_W selectByPrimaryKey(@Param("TW_CD") String TW_CD, @Param("TM") Date TM);

    List<GS_TW_W> selectAll();

    int updateByPrimaryKey(GS_TW_W row);
}