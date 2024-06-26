package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_MISP_D;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GS_MISP_DMapper {
    int deleteByPrimaryKey(String RP_CD);

    int insert(GS_MISP_D row);

    GS_MISP_D selectByPrimaryKey(String RP_CD);

    List<GS_MISP_D> selectAll();

    int updateByPrimaryKey(GS_MISP_D row);
}