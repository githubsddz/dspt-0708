package com.sddz.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sddz.gmall.pms.entity.SkuImagesEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * sku图片
 *
 * @author sddz
 * @email sddz@sddz.com
 * @date 2020-07-08 18:19:12
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageVo queryPage(QueryCondition params);
}

