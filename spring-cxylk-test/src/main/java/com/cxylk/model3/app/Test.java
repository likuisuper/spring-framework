package com.cxylk.model3.app;

import com.cxylk.model3.dao.UserDao;
import com.cxylk.model3.service.UserService;
import com.cxylk.model3.util.MyFactoryBean;
import com.cxylk.model3.util.MySqlSession;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Classname Test
 * @Description TODO
 * @Author likui
 * @Date 2021/7/4 13:12
 **/
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
//		UserDao userMapper = (UserDao) MySqlSession.getMapper(UserDao.class);
		ac.register(App.class);

//		ac.getBeanFactory().registerSingleton("dao",userMapper);

		ac.refresh();



		UserService service = ac.getBean(UserService.class);
		service.query();

		//		System.out.println(ac.getBean(MyFactoryBean.class));
//		System.out.println(ac.getBean("&mf"));


//		UserDao userMapper = (UserDao) MySqlSession.getMapper(UserDao.class);
//		userMapper.queryById();
	}
}
