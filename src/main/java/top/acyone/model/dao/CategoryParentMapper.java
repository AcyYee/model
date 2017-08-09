package top.acyone.model.dao;

import top.acyone.model.entity.CategoryParent;

public interface CategoryParentMapper {
    int deleteByPrimaryKey(Integer cpId);

    int insert(CategoryParent record);

    int insertSelective(CategoryParent record);

    CategoryParent selectByPrimaryKey(Integer cpId);

    int updateByPrimaryKeySelective(CategoryParent record);

    int updateByPrimaryKey(CategoryParent record);
}