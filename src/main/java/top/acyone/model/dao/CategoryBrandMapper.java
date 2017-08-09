package top.acyone.model.dao;

import top.acyone.model.entity.CategoryBrand;

public interface CategoryBrandMapper {
    int deleteByPrimaryKey(Integer brandId);

    int insert(CategoryBrand record);

    int insertSelective(CategoryBrand record);

    CategoryBrand selectByPrimaryKey(Integer brandId);

    int updateByPrimaryKeySelective(CategoryBrand record);

    int updateByPrimaryKey(CategoryBrand record);
}