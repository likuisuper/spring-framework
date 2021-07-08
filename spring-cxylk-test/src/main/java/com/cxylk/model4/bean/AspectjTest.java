package com.cxylk.model4.bean;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Classname AspectjTest
 * @Description 测试aop的执行时机
 * @Author likui
 * @Date 2021/7/8 10:03
 **/
@Aspect
@Component
public class AspectjTest {

	@Pointcut("within(com.cxylk.model4.bean.X)")
	public void pointCut(){

	}

	@Before("pointCut()")
	public void before(){
		System.out.println("aop before");
	}
}
