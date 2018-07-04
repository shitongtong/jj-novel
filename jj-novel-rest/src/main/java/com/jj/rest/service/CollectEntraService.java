package com.jj.rest.service;

import com.jj.rest.po.CollectEntra;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/7/3.
 */
public interface CollectEntraService {

	int save(CollectEntra collectEntra);

	CollectEntra findByUuid(String uuid);

	/**
     * 根据uuid更新
     * @param collectEntra
     * @return
     */
	int update(CollectEntra collectEntra);

	
}