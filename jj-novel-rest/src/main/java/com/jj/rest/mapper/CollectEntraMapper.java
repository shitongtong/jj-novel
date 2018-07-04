package com.jj.rest.mapper;

import com.jj.rest.po.CollectEntra;

public interface CollectEntraMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(CollectEntra record);

    CollectEntra selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CollectEntra record);

    CollectEntra selectByUuid(String uuid);

    int updateByUuidSelective(CollectEntra record);
}