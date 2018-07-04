package com.jj.rest.mapper;

import com.jj.rest.po.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    User selectByUuid(String uuid);

    int updateByUuidSelective(User record);
}