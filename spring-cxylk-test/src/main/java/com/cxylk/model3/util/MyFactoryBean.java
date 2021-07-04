package com.cxylk.model3.util;

import com.cxylk.model3.dao.UserDao;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @Classname MyFactoryBean
 * @Description 使用factoryBean创造对象
 * @Author likui
 * @Date 2021/7/4 15:06
 **/
public class MyFactoryBean implements FactoryBean {

	Class mapperInterface;

	public MyFactoryBean(){

	}

	public MyFactoryBean(Class mapperInterface){
		this.mapperInterface=mapperInterface;
	}

	@Override
	public Object getObject() throws Exception {
		return MySqlSession.getMapper(mapperInterface);
	}

	public void setMapperInterface(Class mapperInterface) {
		this.mapperInterface = mapperInterface;
	}

	@Override
	public Class<?> getObjectType() {
		return mapperInterface;
	}
}
