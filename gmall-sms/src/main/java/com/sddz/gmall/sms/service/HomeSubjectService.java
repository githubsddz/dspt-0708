package com.sddz.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sddz.gmall.sms.entity.HomeSubjectEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author sddz
 * @email sddz@sddz.com
 * @date 2020-07-09 12:15:58
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageVo queryPage(QueryCondition params);
}

