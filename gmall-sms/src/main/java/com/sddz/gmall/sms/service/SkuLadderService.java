package com.sddz.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sddz.gmall.sms.entity.SkuLadderEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品阶梯价格
 *
 * @author sddz
 * @email sddz@sddz.com
 * @date 2020-07-09 12:15:58
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageVo queryPage(QueryCondition params);
}

