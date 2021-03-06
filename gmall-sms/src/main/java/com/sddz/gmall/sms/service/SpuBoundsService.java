package com.sddz.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sddz.gmall.sms.entity.SpuBoundsEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品spu积分设置
 *
 * @author sddz
 * @email sddz@sddz.com
 * @date 2020-07-09 12:15:58
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageVo queryPage(QueryCondition params);
}

