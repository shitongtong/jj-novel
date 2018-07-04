package com.jj.rest.mapper;

import com.jj.rest.po.Chapter;

public interface ChapterMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Chapter record);

    Chapter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Chapter record);

    Chapter selectByUuid(String uuid);

    int updateByUuidSelective(Chapter record);
}