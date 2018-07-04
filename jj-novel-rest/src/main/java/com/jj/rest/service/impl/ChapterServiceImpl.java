package com.jj.rest.service.impl;

import com.jj.rest.mapper.ChapterMapper;
import com.jj.rest.po.Chapter;
import com.jj.rest.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/7/3.
 */
@Service
public class ChapterServiceImpl implements ChapterService {

	@Autowired
	private ChapterMapper chapterMapper;

	@Override
	public int save(Chapter chapter) {
		return chapterMapper.insertSelective(chapter);
	}

	@Override
	public Chapter findByUuid(String uuid) {
		return chapterMapper.selectByUuid(uuid);
	}

	@Override
	public int update(Chapter chapter) {
		return chapterMapper.updateByUuidSelective(chapter);
	}

}