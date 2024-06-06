package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_BCP_D;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GS_BCP_DMapper {
    int deleteByPrimaryKey(@Param("RP_CD") String RP_CD, @Param("SPT") Date SPT);

    int insert(GS_BCP_D row);

    GS_BCP_D selectByPrimaryKey(@Param("RP_CD") String RP_CD, @Param("SPT") Date SPT);

    List<GS_BCP_D> selectAll();

    int updateByPrimaryKey(GS_BCP_D row);
}