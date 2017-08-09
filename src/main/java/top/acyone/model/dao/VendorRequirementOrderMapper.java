package top.acyone.model.dao;

import top.acyone.model.entity.VendorRequirementOrder;

public interface VendorRequirementOrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(VendorRequirementOrder record);

    int insertSelective(VendorRequirementOrder record);

    VendorRequirementOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(VendorRequirementOrder record);

    int updateByPrimaryKey(VendorRequirementOrder record);
}