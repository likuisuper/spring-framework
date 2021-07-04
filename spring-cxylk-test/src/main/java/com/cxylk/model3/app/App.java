package com.cxylk.model3.app;

import com.cxylk.model3.dao.UserDao;
import com.cxylk.model3.util.MyFactoryBean;
import com.cxylk.model3.util.MyImportBeanDefinitionRegistrar;
import com.cxylk.model3.util.MyScan;
import com.cxylk.model3.util.MySqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @Classname App
 * @Description TODO
 * @Author likui
 * @Date 2021/7/4 13:01
 **/
//@MapperScan("com.cxylk.model3.dao")
//@Import(MyImportBeanDefinitionRegistrar.class)
@ComponentScan("com.cxylk.model3")
@MyScan
public class App {
//	@Bean
//	public UserDao getUserDao(){
//		return (UserDao) MySqlSession.getMapper(UserDao.class);
//	}

//	@Bean
//	public MyFactoryBean getUserDao(){
//		return new MyFactoryBean(UserDao.class);
//	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource());
		return factoryBean.getObject();
	}

	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource
				= new DriverManagerDataSource();


		dataSource.setUrl("jdbc:mysql://localhost:3306/mybatis?useUnicode=true&useJDBCCompliantTimezoneShift=true&serverTimezone=UTC&characterEncoding=utf8");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("root");

		return dataSource;
	}
}
