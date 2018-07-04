package com.jj.rest.service.impl;

import com.jj.rest.mapper.NovelMapper;
import com.jj.rest.po.Novel;
import com.jj.rest.service.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/7/3.
 */
@Service
public class NovelServiceImpl implements NovelService {

	@Autowired
	private NovelMapper novelMapper;

	@Override
	public int save(Novel novel) {
		return novelMapper.insertSelective(novel);
	}

	@Override
	public Novel findByUuid(String uuid) {
		return novelMapper.selectByUuid(uuid);
	}

	@Override
	public int update(Novel novel) {
		return novelMapper.updateByUuidSelective(novel);
	}

}