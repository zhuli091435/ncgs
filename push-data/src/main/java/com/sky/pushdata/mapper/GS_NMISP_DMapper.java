package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_NMISP_D;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GS_NMISP_DMapper {
    int deleteByPrimaryKey(String RP_CD);

    int insert(GS_NMISP_D row);

    GS_NMISP_D selectByPrimaryKey(String RP_CD);

    List<GS_NMISP_D> selectAll();

    int updateByPrimaryKey(GS_NMISP_D row);
}