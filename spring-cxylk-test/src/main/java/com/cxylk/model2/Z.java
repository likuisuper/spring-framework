package com.cxylk.model2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * @Classname Z
 * @Description 实现子类接口BeanDefinitionRegistryPostProcessor，并且直接提供给spring
 * @Author likui
 * @Date 2021/7/2 15:09
 **/
public class Z implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("Z ----------------实现BeanDefinitionRegistryPostProcessor的postProcessBeanDefinitionRegistry方法，手动提供给spring");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Z ----------------实现BeanDefinitionRegistryPostProcessor的postProcessBeanFactory方法，手动提供给spring");
	}
}
