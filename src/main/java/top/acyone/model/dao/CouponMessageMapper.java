package top.acyone.model.dao;

import top.acyone.model.entity.CouponMessage;

public interface CouponMessageMapper {
    int deleteByPrimaryKey(Integer couponId);

    int insert(CouponMessage record);

    int insertSelective(CouponMessage record);

    CouponMessage selectByPrimaryKey(Integer couponId);

    int updateByPrimaryKeySelective(CouponMessage record);

    int updateByPrimaryKey(CouponMessage record);
}