package com.sky.pushdata.mapper;

import com.sky.pushdata.pojo.GS_AWQMD_D;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GS_AWQMD_DMapper {
    int deleteByPrimaryKey(@Param("STCD") String STCD, @Param("SPT") Date SPT);

    int insert(GS_AWQMD_D row);

    GS_AWQMD_D selectByPrimaryKey(@Param("STCD") String STCD, @Param("SPT") Date SPT);

    List<GS_AWQMD_D> selectAll();

    int updateByPrimaryKey(GS_AWQMD_D row);
}