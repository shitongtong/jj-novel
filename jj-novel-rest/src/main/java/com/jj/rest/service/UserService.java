package com.jj.rest.service;

import com.jj.rest.po.User;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/7/3.
 */
public interface UserService {

	int save(User user);

	User findByUuid(String uuid);

	/**
     * 根据uuid更新
     * @param user
     * @return
     */
	int update(User user);

	
}