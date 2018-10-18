package com.fym.service;

import java.util.Map;

import com.github.pagehelper.PageInfo;

public interface BaseService<T> {
	
	public T selectOne(int id);
	
	public PageInfo<T> selectAll(Map<String, Object> map);

	
	public int insert(T t);
	
	public int delete(int id);
	
	public int update(T t);
}
