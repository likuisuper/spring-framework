package com.cxylk.model2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @Classname Y
 * @Description 不加Component注解，并且实现BeanFactoryPostProcessor接口
 * @Author likui
 * @Date 2021/7/2 14:58
 **/
public class Y implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Y ----------------实现BeanFactoryPostProcessor，手动提供给spring");
	}
}
