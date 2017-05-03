package com.hot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hot.dao.cluster.CityDao;
import com.hot.dao.master.UserDao;
import com.hot.domain.City;
import com.hot.domain.User;
import com.hot.service.UserService;

/**
 * 用户业务实现层
 * 
 * @author houjianpo
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private CityDao cityDao;

	@Override
	public User findByUserName(String userName) {
		// 单独去主库查询用户信息
		User user = userDao.findByUserName(userName);
		// 在去从库查询地址信息
		City city = cityDao.findByCityName("温岭市");
		// 将用户信息合并
		user.setCity(city);
		return user;
	}

}
