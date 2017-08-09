package top.acyone.model.dao;

import top.acyone.model.entity.VendorRecommendation;

public interface VendorRecommendationMapper {
    int deleteByPrimaryKey(Integer vendorRecommendeId);

    int insert(VendorRecommendation record);

    int insertSelective(VendorRecommendation record);

    VendorRecommendation selectByPrimaryKey(Integer vendorRecommendeId);

    int updateByPrimaryKeySelective(VendorRecommendation record);

    int updateByPrimaryKey(VendorRecommendation record);
}