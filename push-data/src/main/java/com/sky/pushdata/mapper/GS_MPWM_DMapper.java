package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_MPWM_D;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GS_MPWM_DMapper {
    int deleteByPrimaryKey(@Param("STCD") String STCD, @Param("TM") Date TM);

    int insert(GS_MPWM_D row);

    GS_MPWM_D selectByPrimaryKey(@Param("STCD") String STCD, @Param("TM") Date TM);

    List<GS_MPWM_D> selectAll();

    int updateByPrimaryKey(GS_MPWM_D row);
}