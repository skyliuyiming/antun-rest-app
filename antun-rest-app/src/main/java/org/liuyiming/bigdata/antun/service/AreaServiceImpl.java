package org.liuyiming.bigdata.antun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;

import org.liuyiming.bigdata.antun.domain.Area;
import org.liuyiming.bigdata.antun.domain.AreaExample;
import org.liuyiming.bigdata.antun.domain.AreaExample.Criteria;
import org.liuyiming.bigdata.antun.mapper.AreaMapper;

@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaMapper areaMapper;

	@Override
	public Area findById(Long town) {
		return areaMapper.selectByPrimaryKey(town);
	}

	@Override
	public List<Area> findByParentId(Long parentId) {
		// TODO Auto-generated method stub

		AreaExample areaExample = new AreaExample();
		
		Criteria createCriteria= areaExample.createCriteria();
		
		createCriteria.andParentIdEqualTo(parentId);

		return areaMapper.selectByExample(areaExample);
	}
}
