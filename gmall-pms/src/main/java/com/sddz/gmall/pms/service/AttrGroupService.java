package com.sddz.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sddz.gmall.pms.entity.AttrGroupEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 属性分组
 *
 * @author sddz
 * @email sddz@sddz.com
 * @date 2020-07-08 18:19:12
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageVo queryPage(QueryCondition params);
}

