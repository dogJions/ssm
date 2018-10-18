package com.fym.service;

import java.util.Map;

import com.fym.entity.Bill;
import com.github.pagehelper.PageInfo;

public interface BillService extends BaseService<Bill>{
	
	PageInfo<Bill> selectAll(Map<String, Object> map);
}
