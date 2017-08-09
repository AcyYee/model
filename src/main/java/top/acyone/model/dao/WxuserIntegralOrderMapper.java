package top.acyone.model.dao;

import top.acyone.model.entity.WxuserIntegralOrder;

public interface WxuserIntegralOrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(WxuserIntegralOrder record);

    int insertSelective(WxuserIntegralOrder record);

    WxuserIntegralOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(WxuserIntegralOrder record);

    int updateByPrimaryKey(WxuserIntegralOrder record);
}