package com.cxylk.model2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Classname B
 * @Description 实现BeanFactoryPostProcessor接口的类
 * @Author likui
 * @Date 2021/7/2 10:28
 **/
@Component
public class B implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("B ----------------实现BeanFactoryPostProcessor");
	}
}
