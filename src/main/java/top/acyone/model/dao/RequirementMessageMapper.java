package top.acyone.model.dao;

import top.acyone.model.entity.RequirementMessage;

public interface RequirementMessageMapper {
    int deleteByPrimaryKey(Integer requirementId);

    int insert(RequirementMessage record);

    int insertSelective(RequirementMessage record);

    RequirementMessage selectByPrimaryKey(Integer requirementId);

    int updateByPrimaryKeySelective(RequirementMessage record);

    int updateByPrimaryKey(RequirementMessage record);
}