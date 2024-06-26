package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_AAACP_D;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GS_AAACP_DMapper {
    int deleteByPrimaryKey(String RP_CD);

    int insert(GS_AAACP_D row);

    GS_AAACP_D selectByPrimaryKey(String RP_CD);

    List<GS_AAACP_D> selectAll();

    int updateByPrimaryKey(GS_AAACP_D row);
}