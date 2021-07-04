package com.cxylk.model3.util;

import com.cxylk.model3.dao.BlogDao;
import com.cxylk.model3.dao.UserDao;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname MyImportBeanDefinitionRegistrar
 * @Description 将bean的bd注册到容器中。这个类要生效，那么需要在App添加注解扫描该类
 * @Author likui
 * @Date 2021/7/4 17:14
 **/
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {


		//模拟扫描多个bean
		List<Class> list=new ArrayList<>();
		list.add(UserDao.class);
		list.add(BlogDao.class);

		for (Class aClass : list) {
			//这里调用的是myfactorybean的无参构造方法
			BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(MyFactoryBean.class);
			//获取bd
			AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
			MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
			//因为使用的是无参构造方法，也就是说传不了参数，所以需要手动传递参数
			//找到mapperInterface，看有没有该值，有的话就调用MyFactoryBean的set方法，第二个参数就是set方法需要的参数
			propertyValues.add("mapperInterface", aClass);
			registry.registerBeanDefinition(aClass.getSimpleName(),beanDefinition);
		}
	}
}
