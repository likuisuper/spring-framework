package com.cxylk.model3.util;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Classname MyScan
 * @Description 模拟扫描多个类的注解
 * @Author likui
 * @Date 2021/7/4 17:37
 **/
@Retention(RetentionPolicy.RUNTIME)
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface MyScan {
}
