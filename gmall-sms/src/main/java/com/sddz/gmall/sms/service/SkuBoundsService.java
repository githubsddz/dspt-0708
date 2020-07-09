package com.sddz.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sddz.gmall.sms.entity.SkuBoundsEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品sku积分设置
 *
 * @author sddz
 * @email sddz@sddz.com
 * @date 2020-07-09 12:15:58
 */
public interface SkuBoundsService extends IService<SkuBoundsEntity> {

    PageVo queryPage(QueryCondition params);
}

