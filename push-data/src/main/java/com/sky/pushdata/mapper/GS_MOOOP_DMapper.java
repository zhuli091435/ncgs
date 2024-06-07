package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_MOOOP_D;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GS_MOOOP_DMapper {
    int deleteByPrimaryKey(String RP_CD);

    int insert(GS_MOOOP_D row);

    GS_MOOOP_D selectByPrimaryKey(String RP_CD);

    List<GS_MOOOP_D> selectAll();

    int updateByPrimaryKey(GS_MOOOP_D row);
}