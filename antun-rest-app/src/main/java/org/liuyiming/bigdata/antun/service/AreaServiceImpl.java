package org.liuyiming.bigdata.antun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.liuyiming.bigdata.antun.domain.Area;
import org.liuyiming.bigdata.antun.mapper.AreaMapper;

/**
 * 地区业务类
 * @author zdjy
 *
 */
@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaMapper areaMapper;

	@Override
	public Area findById(Long town) {
		return areaMapper.selectByPrimaryKey(town);
	}
}
