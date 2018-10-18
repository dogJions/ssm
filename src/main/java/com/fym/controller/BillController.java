package com.fym.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fym.dao.ProviderMapper;
import com.fym.entity.Bill;
import com.fym.entity.Provider;
import com.fym.entity.User;
import com.fym.service.BillService;

@Controller
@RequestMapping("/bill")
public class BillController extends BaseController<BillService>{
	
	@Autowired
	ProviderMapper providerMapper;
	
	@RequestMapping("/to_bill_all")
	public String toBillAll(ModelMap modelMap) {
		modelMap.put("providerList", providerMapper.selectAll(null));
		return "bill/billAll";
	}
	
	@RequestMapping("/to_bill_all_list")
	public String toBillAllList(@RequestParam(value="pageNum",required=false,defaultValue="1")int pageNum
			,ModelMap modelMap
			,@RequestParam(value="proName",required=false,defaultValue="")String proName
			,@RequestParam(value="isPayment",required=false,defaultValue="0")int isPayment
			,@RequestParam(value="proId",required=false,defaultValue="0")int proId
			,@RequestParam(value="id",required=false,defaultValue="0")int id) {
		
		if(id!=0) {
			baseService.delete(id);
		}
		
		Map<String, Object> map=new HashMap<>();
		map.put("proName", proName);
		map.put("pageNum", pageNum);
		map.put("isPayment",isPayment );
		map.put("proId",proId );
		modelMap.put("info", baseService.selectAll(map));
		
		return "bill/billAllList";
	}
	
	@RequestMapping("/to_bill_add")
	public String tobillAdd(ModelMap modelMap) {
		modelMap.put("providerList", providerMapper.selectAll(null));
		return "bill/addBill";
	}
	
	@RequestMapping("/bill_add")
	public String billrAdd(HttpSession session,Bill billForm,@RequestParam("providerId")Long proId) {
		Bill bill=new Bill();
		User user=(User) session.getAttribute("user");
		Provider provider= new Provider();
		
		bill.setBillcode(billForm.getBillcode());
		bill.setProductname(billForm.getProductname());
		bill.setProductunit(billForm.getProductunit());
		bill.setProductcount(billForm.getProductcount());
		bill.setTotalprice(billForm.getTotalprice());
		provider=providerMapper.selectByPrimaryKey(proId);
		bill.setProviderid(proId);
		bill.setProvider(provider);
		bill.setIspayment(billForm.getIspayment());
		bill.setCreatedby(user.getId());
		bill.setCreationdate(new Date());
		baseService.insert(bill);
		
		return "redirect:/bill/to_bill_all";
	}
	
	@RequestMapping("/to_bill_update")
	public String tobillUpdate(ModelMap modelMap,@RequestParam("id")int id) {
		modelMap.put("providerList", providerMapper.selectAll(null));
		modelMap.put("bill",baseService.selectOne(id));
		return "bill/updateBill";
	}
	
	@RequestMapping("/bill_update")
	public String billUpdate(HttpSession session,Bill billForm,@RequestParam("providerId")Long proId) {
		Bill bill=new Bill();
		User user=(User) session.getAttribute("user");
		Provider provider= new Provider();
		
		bill.setBillcode(billForm.getBillcode());
		bill.setProductname(billForm.getProductname());
		bill.setProductunit(billForm.getProductunit());
		bill.setProductcount(billForm.getProductcount());
		bill.setTotalprice(billForm.getTotalprice());
		provider=providerMapper.selectByPrimaryKey(proId);
		bill.setProviderid(proId);
		bill.setProvider(provider);
		bill.setIspayment(billForm.getIspayment());
		bill.setModifyby(user.getId());
		bill.setModifydate(new Date());
		baseService.update(bill);
		
		return "redirect:/bill/to_bill_all";
	}
	
	@RequestMapping("/to_bill_get")
	public String tobillGet(ModelMap modelMap,@RequestParam("id")int id) {
		modelMap.put("providerList", providerMapper.selectAll(null));
		modelMap.put("bill",baseService.selectOne(id));
		return "bill/getBill";
	}
}
