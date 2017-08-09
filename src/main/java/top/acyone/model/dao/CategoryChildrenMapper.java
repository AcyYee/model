package top.acyone.model.dao;

import top.acyone.model.entity.CategoryChildren;

public interface CategoryChildrenMapper {
    int deleteByPrimaryKey(Integer ccId);

    int insert(CategoryChildren record);

    int insertSelective(CategoryChildren record);

    CategoryChildren selectByPrimaryKey(Integer ccId);

    int updateByPrimaryKeySelective(CategoryChildren record);

    int updateByPrimaryKey(CategoryChildren record);
}