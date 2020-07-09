package com.sddz.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sddz.gmall.pms.entity.BrandEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 品牌
 *
 * @author sddz
 * @email sddz@sddz.com
 * @date 2020-07-08 18:19:12
 */
public interface BrandService extends IService<BrandEntity> {

    PageVo queryPage(QueryCondition params);
}

