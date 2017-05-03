package com.hot.dao.master;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.hot.domain.User;

/**
 * 用户 DAO 接口类
 * 
 * @author houjianpo
 *
 */
@Mapper
public interface UserDao {

	/**
	 * 根据用户名获取用户信息
	 *
	 * @param userName
	 * @return
	 */
	public User findByUserName(@Param("userName") String userName);
}
