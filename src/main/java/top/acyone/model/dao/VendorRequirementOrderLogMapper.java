package top.acyone.model.dao;

import top.acyone.model.entity.VendorRequirementOrderLog;

public interface VendorRequirementOrderLogMapper {
    int deleteByPrimaryKey(Integer orderLogId);

    int insert(VendorRequirementOrderLog record);

    int insertSelective(VendorRequirementOrderLog record);

    VendorRequirementOrderLog selectByPrimaryKey(Integer orderLogId);

    int updateByPrimaryKeySelective(VendorRequirementOrderLog record);

    int updateByPrimaryKey(VendorRequirementOrderLog record);
}