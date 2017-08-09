package top.acyone.model.dao;

import top.acyone.model.entity.VendorProductOrder;

public interface VendorProductOrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(VendorProductOrder record);

    int insertSelective(VendorProductOrder record);

    VendorProductOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(VendorProductOrder record);

    int updateByPrimaryKey(VendorProductOrder record);
}