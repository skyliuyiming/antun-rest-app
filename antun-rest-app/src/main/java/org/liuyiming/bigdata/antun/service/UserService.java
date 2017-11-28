package org.liuyiming.bigdata.antun.service;

import java.util.List;

import org.liuyiming.bigdata.antun.domain.User;
import org.liuyiming.bigdata.antun.web.model.UserAdd;
import org.liuyiming.bigdata.antun.web.model.UserUpdate;

public interface UserService {

	List<User> findAll();

	int addUser(UserAdd userAdd);

	User getUser(Long id);

	int updateUser(Long id, UserUpdate userUpdate);

	int deleteUser(Long id);

	User findByPhone(String phone);

	int updateUser(User user);

	List<User> findByStatus(int i);

}
