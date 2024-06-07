package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_WBHP_D;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GS_WBHP_DMapper {
    int deleteByPrimaryKey(String RP_CD);

    int insert(GS_WBHP_D row);

    GS_WBHP_D selectByPrimaryKey(String RP_CD);

    List<GS_WBHP_D> selectAll();

    int updateByPrimaryKey(GS_WBHP_D row);
}