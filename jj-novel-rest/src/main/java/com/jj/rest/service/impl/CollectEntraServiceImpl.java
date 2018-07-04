package com.jj.rest.service.impl;

import com.jj.rest.mapper.CollectEntraMapper;
import com.jj.rest.po.CollectEntra;
import com.jj.rest.service.CollectEntraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/7/3.
 */
@Service
public class CollectEntraServiceImpl implements CollectEntraService {

	@Autowired
	private CollectEntraMapper collectEntraMapper;

	@Override
	public int save(CollectEntra collectEntra) {
		return collectEntraMapper.insertSelective(collectEntra);
	}

	@Override
	public CollectEntra findByUuid(String uuid) {
		return collectEntraMapper.selectByUuid(uuid);
	}

	@Override
	public int update(CollectEntra collectEntra) {
		return collectEntraMapper.updateByUuidSelective(collectEntra);
	}

}