package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_OPCP_D;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GS_OPCP_DMapper {
    int deleteByPrimaryKey(String RP_CD);

    int insert(GS_OPCP_D row);

    GS_OPCP_D selectByPrimaryKey(String RP_CD);

    List<GS_OPCP_D> selectAll();

    int updateByPrimaryKey(GS_OPCP_D row);
}