package com.cxylk.model3.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Classname BlogDao
 * @Description TODO
 * @Author likui
 * @Date 2021/7/4 16:15
 **/
public interface BlogDao {
	@Select("select * from blog")
	List<Map<String,Object>> query();
}
