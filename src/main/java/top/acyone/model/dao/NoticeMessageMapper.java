package top.acyone.model.dao;

import top.acyone.model.entity.NoticeMessage;

public interface NoticeMessageMapper {
    int deleteByPrimaryKey(Integer noticeId);

    int insert(NoticeMessage record);

    int insertSelective(NoticeMessage record);

    NoticeMessage selectByPrimaryKey(Integer noticeId);

    int updateByPrimaryKeySelective(NoticeMessage record);

    int updateByPrimaryKeyWithBLOBs(NoticeMessage record);

    int updateByPrimaryKey(NoticeMessage record);
}