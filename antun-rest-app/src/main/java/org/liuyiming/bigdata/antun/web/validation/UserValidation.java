package org.liuyiming.bigdata.antun.web.validation;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.liuyiming.bigdata.antun.domain.User;
import org.liuyiming.bigdata.antun.service.UserService;
import org.liuyiming.bigdata.antun.web.model.UserAdd;
import org.liuyiming.bigdata.antun.web.model.UserUpdate;

@Component
public class UserValidation {
	@Autowired
	private UserService userService;
	private String name_pattern = "[\\u4e00-\\u9fa5]{2,10}";

	/**
	 * 新增验证
	 * 
	 * @param userAdd
	 * @return
	 */
	public String addUserValidation(UserAdd userAdd) {
		// 字段验证
		// 姓名验证
		// 1、为空验证
		if (StringUtils.isBlank(userAdd.getName()))
			return "姓名为空";
		// 2、汉字验证(正则表达式)
		if (!userAdd.getName().matches(name_pattern))
			return "姓名不符合要求";
		// ..

		// 数据去重--手机号码去重
		User user = userService.findByPhone(userAdd.getPhone());
		if (user != null)
			return "手机号重复";

		return null;
	}

	/**
	 * 修改验证
	 * 
	 * @param userUpdate
	 * @return
	 */
	public String updateUserValidation(UserUpdate userUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

}
