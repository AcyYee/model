package top.acyone.model.dao;

import top.acyone.model.entity.LogisticsCompany;

public interface LogisticsCompanyMapper {
    int deleteByPrimaryKey(Integer companyId);

    int insert(LogisticsCompany record);

    int insertSelective(LogisticsCompany record);

    LogisticsCompany selectByPrimaryKey(Integer companyId);

    int updateByPrimaryKeySelective(LogisticsCompany record);

    int updateByPrimaryKey(LogisticsCompany record);
}