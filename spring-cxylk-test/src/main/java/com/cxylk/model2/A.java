package com.cxylk.model2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Classname A
 * @Description 实现BeanDefinitionRegisterPostProcessor接口的类
 * @Author likui
 * @Date 2021/7/2 10:25
 **/
@Component
public class A implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("A ----------------实现BeanDefinitionRegistryPostProcessor的postProcessBeanDefinitionRegistry方法");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("A ----------------实现BeanDefinitionRegistryPostProcessor的postProcessBeanFactory方法");
	}
}
