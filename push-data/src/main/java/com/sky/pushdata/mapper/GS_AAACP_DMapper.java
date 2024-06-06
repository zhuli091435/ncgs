package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_AAACP_D;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GS_AAACP_DMapper {
    int deleteByPrimaryKey(@Param("RP_CD") String RP_CD, @Param("SPT") Date SPT);

    int insert(GS_AAACP_D row);

    GS_AAACP_D selectByPrimaryKey(@Param("RP_CD") String RP_CD, @Param("SPT") Date SPT);

    List<GS_AAACP_D> selectAll();

    int updateByPrimaryKey(GS_AAACP_D row);
}