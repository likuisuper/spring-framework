package com.cxylk.model4.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Classname X
 * @Description 演示bean的生命周期，执行流程
 * @Author likui
 * @Date 2021/7/6 17:02
 **/
@Component
public class X implements ApplicationContextAware, BeanNameAware, InitializingBean {

	//得到一个spring容器
	ApplicationContext applicationContext;

	@Autowired
	A a;

	public X(){
		System.out.println("create x");
	}

	public X(Y y){
		System.out.println("create x with y");
	}

	public X(Y y,Z z){
		System.out.println("create x with y and z");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("applicationContext的回调");
		this.applicationContext=applicationContext;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName的回调");
	}

	@PostConstruct
	public void jsrInitMethod(){
		System.out.println("jsr-250 annotation init");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("lifecycle  callback from  InitializingBean");
	}

	public void testAop(){
		System.out.println("loginc aop");
	}
}
