package com.cxylk.model5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Classname N
 * @Description 循环依赖
 * @Author likui
 * @Date 2021/7/11 17:21
 **/
@Component
public class N {
	@Autowired
	M m;

	public N(){
		System.out.println("crate n");
	}
}
