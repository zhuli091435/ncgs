package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_TW_B;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GS_TW_BMapper {
    int deleteByPrimaryKey(@Param("TW_CD") String TW_CD, @Param("TWNW") String TWNW);

    int insert(GS_TW_B row);

    GS_TW_B selectByPrimaryKey(@Param("TW_CD") String TW_CD, @Param("TWNW") String TWNW);

    List<GS_TW_B> selectAll();

    int updateByPrimaryKey(GS_TW_B row);

    GS_TW_B getByTW_CD(String twCd);

    int modifyByTW_CD(GS_TW_B item);
}