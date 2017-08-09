package top.acyone.model.dao;

import top.acyone.model.entity.WxuserProductCollection;

public interface WxuserProductCollectionMapper {
    int deleteByPrimaryKey(Integer collectionId);

    int insert(WxuserProductCollection record);

    int insertSelective(WxuserProductCollection record);

    WxuserProductCollection selectByPrimaryKey(Integer collectionId);

    int updateByPrimaryKeySelective(WxuserProductCollection record);

    int updateByPrimaryKey(WxuserProductCollection record);
}