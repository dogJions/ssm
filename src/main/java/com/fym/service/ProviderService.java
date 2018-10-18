package com.fym.service;

import java.util.Map;

import com.fym.entity.Provider;
import com.github.pagehelper.PageInfo;

public interface ProviderService extends BaseService<Provider>{
	
	PageInfo<Provider> selectAll(Map<String, Object> map);
}
