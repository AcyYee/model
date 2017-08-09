package top.acyone.model.dao;

import top.acyone.model.entity.ProductMessage;

public interface ProductMessageMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(ProductMessage record);

    int insertSelective(ProductMessage record);

    ProductMessage selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(ProductMessage record);

    int updateByPrimaryKeyWithBLOBs(ProductMessage record);

    int updateByPrimaryKey(ProductMessage record);
}