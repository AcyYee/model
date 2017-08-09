package top.acyone.model.dao;

import top.acyone.model.entity.ForumRecommendation;

public interface ForumRecommendationMapper {
    int deleteByPrimaryKey(Integer forumRecommendeId);

    int insert(ForumRecommendation record);

    int insertSelective(ForumRecommendation record);

    ForumRecommendation selectByPrimaryKey(Integer forumRecommendeId);

    int updateByPrimaryKeySelective(ForumRecommendation record);

    int updateByPrimaryKey(ForumRecommendation record);
}