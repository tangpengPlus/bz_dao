package com.bz.dao.mapper.map;

import com.bz.dao.mapper.base.BaseMapper;
import com.bz.dao.pojo.map.Region;

public interface RegionMapper extends BaseMapper<Region> {
    /**
     *  动态字段,写入数据库记录,system_region
     *
     * @param record
     */
    int insertSelective(Region record);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,system_region
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Region record);
}