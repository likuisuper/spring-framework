package com.cxylk.model5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Classname M
 * @Description 循环依赖
 * @Author likui
 * @Date 2021/7/11 17:20
 **/
@Component
public class M {
	@Autowired
	N n;

	public M(){
		System.out.println("create m");
	}
}
