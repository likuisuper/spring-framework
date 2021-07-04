package com.cxylk.model3.service;

import com.cxylk.model3.dao.BlogDao;
import com.cxylk.model3.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Classname UserService
 * @Description TODO
 * @Author likui
 * @Date 2021/7/4 13:03
 **/
@Component
public class UserService {
	@Autowired
	UserDao userDao;

	@Autowired
	BlogDao blogDao;

	public void query(){
		userDao.query();
		blogDao.query();
	}

	public void queryById(){
		System.out.println(userDao.queryById());
	}
}
