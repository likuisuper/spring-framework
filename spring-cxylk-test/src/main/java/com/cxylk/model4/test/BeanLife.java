package com.cxylk.model4.test;

import com.cxylk.model4.bean.X;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Classname BeanLife
 * @Description bean的生命周期测试
 * @Author likui
 * @Date 2021/7/6 17:03
 **/
public class BeanLife {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		X x = (X) ac.getBean("x");
		x.testAop();
	}
}
