package com.hot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.hot.domain.User;
import com.hot.service.UserService;

/**
 * 用户控制层
 * 
 * @author houjianpo
 *
 */
@RestController
public class UserRestController {

	@Autowired
	private UserService userService;

	/**
	 * 根据用户名获取用户信息，包括从库的地址信息
	 * @param userName
	 * @return
	 */
	@RequestMapping(value = "/api/user", method = RequestMethod.GET)
	public User getByUserName(String userName) {
		return userService.findByUserName(userName);
	}
}
