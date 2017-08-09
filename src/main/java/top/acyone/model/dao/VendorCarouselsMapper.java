package top.acyone.model.dao;

import top.acyone.model.entity.VendorCarousels;

public interface VendorCarouselsMapper {
    int deleteByPrimaryKey(Integer carouselId);

    int insert(VendorCarousels record);

    int insertSelective(VendorCarousels record);

    VendorCarousels selectByPrimaryKey(Integer carouselId);

    int updateByPrimaryKeySelective(VendorCarousels record);

    int updateByPrimaryKey(VendorCarousels record);
}