package com.sddz.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sddz.gmall.pms.entity.SkuSaleAttrValueEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * sku销售属性&值
 *
 * @author sddz
 * @email sddz@sddz.com
 * @date 2020-07-08 18:19:12
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageVo queryPage(QueryCondition params);
}

