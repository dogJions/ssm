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

import com.fym.entity.Provider;
import com.fym.entity.User;
import com.fym.service.ProviderService;
import com.fym.service.UserService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/provider")
public class ProviderController extends BaseController<ProviderService>{
	@Autowired
	UserService servie;
	
	@RequestMapping("/to_provider_All")
	public String toProviderAll() {
		return "provider/ProviderAll";
	}
	
	@RequestMapping("/to_provider_List")
	public String toProviderList(@RequestParam(value="pageNum",required=false,defaultValue="1")int pageNum
			,@RequestParam(value="proCode",required=false,defaultValue="")String proCode
			,@RequestParam(value="proName",required=false,defaultValue="")String proName
			,@RequestParam(value="id",required=false,defaultValue="0")int id
			,ModelMap modelMap) {
		if(id!=0) {
			baseService.delete(id);
		}
		Map<String, Object> map=new HashMap<>();
		map.put("pageNum", pageNum);
		map.put("procode", proCode);
		map.put("proname", proName);
		PageInfo<Provider> info=baseService.selectAll(map);
		modelMap.put("info", info);
		return "provider/ProviderAllList";
	}
	
	@RequestMapping("/to_provider_add")
	public String toProviderAdd() {
		return "provider/addProvider";
	}
	
	@RequestMapping("/provider_add")
	public String providerAdd(HttpSession session,Provider proFrom) {
		Provider pro=new Provider();
		User user=(User) session.getAttribute("user");
		
		pro.setProcode(proFrom.getProcode());
		pro.setProname(proFrom.getProname());
		pro.setProdesc(proFrom.getProdesc());
		pro.setProcontact(proFrom.getProcontact());
		pro.setProphone(proFrom.getProphone());
		pro.setProaddress(proFrom.getProaddress());
		pro.setProfax(proFrom.getProfax());
		pro.setCreatedby(user.getId());
		pro.setCreationdate(new Date());
		baseService.insert(pro);
		
		return "redirect:/provider/to_provider_All";
	}
	
	
	@RequestMapping("/to_provider_update")
	public String toProviderUpdate(@RequestParam("id")int id,ModelMap modelMap) {
		modelMap.put("providerAll", baseService.selectOne(id));
		return "provider/updateProvider";
	}
	
	@RequestMapping("/provider_update")
	public String providerUpdate(HttpSession session,Provider proFrom) {
		Provider pro=new Provider();
		User user=(User) session.getAttribute("user");
		
		pro.setProcode(proFrom.getProcode());
		pro.setProname(proFrom.getProname());
		pro.setProdesc(proFrom.getProdesc());
		pro.setProcontact(proFrom.getProcontact());
		pro.setProphone(proFrom.getProphone());
		pro.setProaddress(proFrom.getProaddress());
		pro.setProfax(proFrom.getProfax());
		pro.setModifyby(user.getId());
		pro.setModifydate(new Date());
		baseService.insert(pro);
		
		return "redirect:/provider/to_provider_All";
	}
	
	@RequestMapping("/to_provider_get")
	public String toProviderGet(@RequestParam("id")int id,ModelMap modelMap) {
		modelMap.put("providerAll", baseService.selectOne(id));
		modelMap.put("providerCty", servie.selectOne(Integer.parseInt(baseService.selectOne(id).getCreatedby().toString())).getUsername());
		return "provider/getProvider";
	}
}
