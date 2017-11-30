package org.liuyiming.bigdata.antun.web;

import java.util.List;

import org.liuyiming.bigdata.antun.domain.Area;
import org.liuyiming.bigdata.antun.service.AreaService;
import org.liuyiming.bigdata.antun.web.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/areas")
public class AreaController extends BaseResponse {

	@Autowired
	private AreaService areaService;

	@RequestMapping(value = "/{parentId}", method = RequestMethod.GET)
	public BaseResponse findByParentId(@PathVariable Long parentId) {

		List<Area> areas = areaService.findByParentId(parentId);

		return successResponse("查询成功").data(areas);
	}

}
