package com.jj.rest.service;

import com.jj.rest.po.Chapter;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/7/3.
 */
public interface ChapterService {

	int save(Chapter chapter);

	Chapter findByUuid(String uuid);

	/**
     * 根据uuid更新
     * @param chapter
     * @return
     */
	int update(Chapter chapter);

	
}