package com.fym.service.imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fym.dao.ProviderMapper;
import com.fym.entity.Provider;
import com.fym.service.ProviderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Service
public class ProviderServiceImp implements ProviderService {

	@Autowired
	ProviderMapper mapper;
	
	public Provider selectOne(int id) {
		return mapper.selectByPrimaryKey(Long.valueOf(id));
	}

	public int insert(Provider t) {
		return mapper.insert(t);
	}

	public int delete(int id) {
		return mapper.deleteByPrimaryKey(Long.valueOf(id));
	}

	public int update(Provider t) {
		return mapper.updateByPrimaryKeySelective(t);
	}

	public PageInfo<Provider> selectAll(Map<String, Object> map) {
		
		int pageNum=(int) map.get("pageNum");
		PageHelper.startPage(pageNum, 5);
		Provider provider=new Provider();
		provider.setProcode(map.get("procode").toString());
		provider.setProname(map.get("proname").toString());
		List<Provider> pList=mapper.selectAll(provider);
		PageInfo<Provider> info=new PageInfo<>(pList);
		return info;
	}

}
