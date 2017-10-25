package com.bz.dao.mapper.merchant;

import com.bz.dao.mapper.base.BaseMapper;
import com.bz.dao.pojo.merchant.MerchantShop;

public interface MerchantShopMapper extends BaseMapper<MerchantShop> {
    /**
     *  动态字段,写入数据库记录,merchant_shop
     *
     * @param record
     */
    int insertSelective(MerchantShop record);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,merchant_shop
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MerchantShop record);
}