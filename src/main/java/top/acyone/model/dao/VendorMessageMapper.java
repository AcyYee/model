package top.acyone.model.dao;

import top.acyone.model.entity.VendorMessage;

public interface VendorMessageMapper {
    int deleteByPrimaryKey(String vendorId);

    int insert(VendorMessage record);

    int insertSelective(VendorMessage record);

    VendorMessage selectByPrimaryKey(String vendorId);

    int updateByPrimaryKeySelective(VendorMessage record);

    int updateByPrimaryKey(VendorMessage record);
}