package com.cxylk.model2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @Classname C
 * @Description 实现BeanDefinitionRegistryPostProcessor和Order接口的类
 * @Author likui
 * @Date 2021/7/2 13:30
 **/
@Component
public class C implements BeanDefinitionRegistryPostProcessor, Ordered {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("C ----------------实现BeanDefinitionRegistryPostProcessor的postProcessBeanDefinitionRegistry方法");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("C ----------------实现BeanDefinitionRegistryPostProcessor的postProcessBeanFactory方法");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
