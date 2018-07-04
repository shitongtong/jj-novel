package com.jj.rest.service.impl;

import com.jj.rest.mapper.UserMapper;
import com.jj.rest.po.User;
import com.jj.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/7/3.
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public int save(User user) {
		return userMapper.insertSelective(user);
	}

	@Override
	public User findByUuid(String uuid) {
		return userMapper.selectByUuid(uuid);
	}

	@Override
	public int update(User user) {
		return userMapper.updateByUuidSelective(user);
	}

}