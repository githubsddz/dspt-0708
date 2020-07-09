package com.sddz.gmall.pms.dao;

import com.sddz.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author sddz
 * @email sddz@sddz.com
 * @date 2020-07-08 18:19:12
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
