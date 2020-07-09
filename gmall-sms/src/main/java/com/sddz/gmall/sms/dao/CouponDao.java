package com.sddz.gmall.sms.dao;

import com.sddz.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author sddz
 * @email sddz@sddz.com
 * @date 2020-07-09 12:15:58
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
