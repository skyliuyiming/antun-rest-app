package org.liuyiming.bigdata.antun.service;

import java.util.List;

import org.liuyiming.bigdata.antun.domain.Area;

public interface AreaService {

	Area findById(Long town);

	List<Area> findByParentId(Long parentId);

}
