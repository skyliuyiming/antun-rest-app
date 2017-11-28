package org.liuyiming.bigdata.antun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.liuyiming.bigdata.antun.domain.User;
import org.liuyiming.bigdata.antun.domain.UserExample;
import org.liuyiming.bigdata.antun.domain.UserExample.Criteria;
import org.liuyiming.bigdata.antun.mapper.UserMapper;
import org.liuyiming.bigdata.antun.util.TransferUtil;
import org.liuyiming.bigdata.antun.web.model.UserAdd;
import org.liuyiming.bigdata.antun.web.model.UserUpdate;

/**
 * 用户数据业务类
 * @author zdjy
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAll() {
		return userMapper.selectByExample(null);
	}

	@Override
	public int addUser(UserAdd userAdd) {
		User transfer = TransferUtil.transfer(userAdd, User.class);
		return userMapper.insertSelective(transfer);
	}

	@Override
	public User getUser(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateUser(Long id, UserUpdate userUpdate) {
		User user = TransferUtil.transfer(userUpdate, User.class);
		user.setId(id);
		return userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public int deleteUser(Long id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public User findByPhone(String phone) {
		//创建查询类对象
		UserExample userExample = new UserExample();
		Criteria createCriteria = userExample.createCriteria();
		//拼接查询参数
		createCriteria.andPhoneEqualTo(phone);
		List<User> selectByExample = userMapper.selectByExample(userExample);
		if(selectByExample.isEmpty())
			return null;
		return selectByExample.get(0);
	}
}
