package com.sddz.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sddz.gmall.sms.entity.CouponEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 优惠券信息
 *
 * @author sddz
 * @email sddz@sddz.com
 * @date 2020-07-09 12:15:58
 */
public interface CouponService extends IService<CouponEntity> {

    PageVo queryPage(QueryCondition params);
}

