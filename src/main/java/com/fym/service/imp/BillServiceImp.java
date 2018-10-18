package com.fym.service.imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fym.dao.BillMapper;
import com.fym.entity.Bill;
import com.fym.entity.Provider;
import com.fym.service.BillService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class BillServiceImp implements BillService {

	@Autowired
	BillMapper mapper;
	
	public Bill selectOne(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(Long.valueOf(id));
	}

	@Override
	public int insert(Bill t) {
		// TODO Auto-generated method stub
		return mapper.insert(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(Long.valueOf(id));
	}

	@Override
	public int update(Bill t) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(t);
	}

	@Override
	public PageInfo<Bill> selectAll(Map<String, Object> map) {
		int pageNum=(int) map.get("pageNum");
		PageHelper.startPage(pageNum, 5);
		Bill bill=new Bill();
		bill.setProductname(map.get("proName").toString());
		Provider provider=new Provider();
		provider.setId(Long.valueOf(map.get("proId").toString()));
		bill.setProvider(provider);
		bill.setIspayment((int)map.get("isPayment"));
		
		List<Bill> bList=mapper.selectAll(bill);
		PageInfo<Bill> info=new PageInfo<>(bList);
		return info;
	}

}
