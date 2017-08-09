package top.acyone.model.dao;

import top.acyone.model.entity.VendorProductRecommendation;

public interface VendorProductRecommendationMapper {
    int deleteByPrimaryKey(Integer reVendorProductId);

    int insert(VendorProductRecommendation record);

    int insertSelective(VendorProductRecommendation record);

    VendorProductRecommendation selectByPrimaryKey(Integer reVendorProductId);

    int updateByPrimaryKeySelective(VendorProductRecommendation record);

    int updateByPrimaryKey(VendorProductRecommendation record);
}