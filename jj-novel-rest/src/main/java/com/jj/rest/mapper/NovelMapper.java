package com.jj.rest.mapper;

import com.jj.rest.po.Novel;

public interface NovelMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Novel record);

    Novel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Novel record);

    int updateByPrimaryKeyWithBLOBs(Novel record);

    Novel selectByUuid(String uuid);

    int updateByUuidSelective(Novel record);
}