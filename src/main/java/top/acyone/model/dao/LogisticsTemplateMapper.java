package top.acyone.model.dao;

import top.acyone.model.entity.LogisticsTemplate;

public interface LogisticsTemplateMapper {
    int deleteByPrimaryKey(Integer templateId);

    int insert(LogisticsTemplate record);

    int insertSelective(LogisticsTemplate record);

    LogisticsTemplate selectByPrimaryKey(Integer templateId);

    int updateByPrimaryKeySelective(LogisticsTemplate record);

    int updateByPrimaryKey(LogisticsTemplate record);
}