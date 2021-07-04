package com.cxylk.model3.util;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Classname MySqlSession
 * @Description 模拟mybatis获取mapper的过程，用的就是JDK动态代理
 * @Author likui
 * @Date 2021/7/4 13:08
 **/
public class MySqlSession {
	public static Object getMapper(Class clazz){
		//拦截UserDao接口或其他Dao接口
		Class[] classes=new Class[]{clazz};
		Object proxy=Proxy.newProxyInstance(MySqlSession.class.getClassLoader(), classes, new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("----conn jdbc");
				Select select = method.getAnnotation(Select.class);
				//获取sql语句
				String sql=select.value()[0];
				System.out.println("----exe sql= ---"+sql);
				return null;
			}
		});
		return proxy;
	}
}
