package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_AT_W;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GS_AT_WMapper {
    int deleteByPrimaryKey(String ATN);

    int insert(GS_AT_W row);

    GS_AT_W selectByPrimaryKey(String ATN);

    List<GS_AT_W> selectAll();

    int updateByPrimaryKey(GS_AT_W row);
}