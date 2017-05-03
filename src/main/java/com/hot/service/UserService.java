package com.hot.service;

import org.apache.ibatis.annotations.Param;
import com.hot.domain.User;

/**
 * 用户业务接口层
 * 
 * @author houjianpo
 *
 */
public interface UserService {
	
	/**
	 * 根据用户名获取用户信息，包括从库的地址信息
	 *
	 * @param userName
	 * @return
	 */
	public User findByUserName(@Param("userName") String userName);
}
