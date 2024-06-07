package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_MP_D;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GS_MP_DMapper {
    int deleteByPrimaryKey(@Param("STCD") String STCD, @Param("TM") Date TM);

    int insert(GS_MP_D row);

    GS_MP_D selectByPrimaryKey(@Param("STCD") String STCD, @Param("TM") Date TM);

    List<GS_MP_D> selectAll();

    int updateByPrimaryKey(GS_MP_D row);
}