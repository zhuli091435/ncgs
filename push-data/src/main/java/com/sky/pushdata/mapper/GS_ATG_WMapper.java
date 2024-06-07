package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_ATG_W;
import com.sky.pushdata.pojo.GS_ATG_W;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GS_ATG_WMapper {
    int deleteByPrimaryKey(@Param("TW_CD") String TW_CD, @Param("STARTTM") Date STARTTM, @Param("ENDTM") Date ENDTM);

    int insert(GS_ATG_W row);

    GS_ATG_W selectByPrimaryKey(@Param("TW_CD") String TW_CD, @Param("STARTTM") Date STARTTM, @Param("ENDTM") Date ENDTM);

    List<GS_ATG_W> selectAll();

    int updateByPrimaryKey(GS_ATG_W row);
}