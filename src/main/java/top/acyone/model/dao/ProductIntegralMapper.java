package top.acyone.model.dao;

import top.acyone.model.entity.ProductIntegral;

public interface ProductIntegralMapper {
    int deleteByPrimaryKey(Integer integralId);

    int insert(ProductIntegral record);

    int insertSelective(ProductIntegral record);

    ProductIntegral selectByPrimaryKey(Integer integralId);

    int updateByPrimaryKeySelective(ProductIntegral record);

    int updateByPrimaryKeyWithBLOBs(ProductIntegral record);

    int updateByPrimaryKey(ProductIntegral record);
}