package com.jj.rest.service;

import com.jj.rest.po.Novel;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/7/3.
 */
public interface NovelService {

	int save(Novel novel);

	Novel findByUuid(String uuid);

	/**
     * 根据uuid更新
     * @param novel
     * @return
     */
	int update(Novel novel);

	
}