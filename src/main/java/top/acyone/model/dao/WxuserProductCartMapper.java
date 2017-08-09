package top.acyone.model.dao;

import top.acyone.model.entity.WxuserProductCart;

public interface WxuserProductCartMapper {
    int deleteByPrimaryKey(Integer cartId);

    int insert(WxuserProductCart record);

    int insertSelective(WxuserProductCart record);

    WxuserProductCart selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKeySelective(WxuserProductCart record);

    int updateByPrimaryKey(WxuserProductCart record);
}