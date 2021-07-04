package com.cxylk.model3.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Classname UserDao
 * @Description TODO
 * @Author likui
 * @Date 2021/7/4 12:57
 **/
public interface UserDao {
	@Select("select * from user")
	List<Map<String,Object>> query();

	@Select("select * from user where id=2")
	List<Map<String,Object>> queryById();
}
