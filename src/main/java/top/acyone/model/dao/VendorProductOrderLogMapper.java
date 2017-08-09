package top.acyone.model.dao;

import top.acyone.model.entity.VendorProductOrderLog;

public interface VendorProductOrderLogMapper {
    int deleteByPrimaryKey(Integer orderLogId);

    int insert(VendorProductOrderLog record);

    int insertSelective(VendorProductOrderLog record);

    VendorProductOrderLog selectByPrimaryKey(Integer orderLogId);

    int updateByPrimaryKeySelective(VendorProductOrderLog record);

    int updateByPrimaryKey(VendorProductOrderLog record);
}