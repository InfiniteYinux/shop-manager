package com.ssm.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.shop.pojo.EasyUIDataGridResult;
import com.ssm.shop.pojo.Item;
import com.ssm.shop.pojo.Login;
import com.ssm.shop.pojo.PageParams;
import com.ssm.shop.service.ItemService;
import com.ssm.shop.service.LoginService;

@Controller
@RequestMapping("/item")
//鍙互閰嶇疆鏁版嵁妯″�?�鐨勫悕绉板拰绫诲�?�锛屼袱鑰呭彇鎴栧叧绯�
public class ItemController {
	
	@Autowired
	private ItemService itemService = null;
	
	@RequestMapping("/get")
public Item getItemById(){
	Item item=itemService.getItemById();
	System.out.println("****************************************");
	return item;
	
}
@RequestMapping("/list")
@ResponseBody
public EasyUIDataGridResult getItemList(int page,int rows) {
	PageParams pageparams=new PageParams();
	pageparams.setPage((page-1)*rows);
	pageparams.setRows(rows);
	List<Item> list = itemService.getItemList(pageparams);
	EasyUIDataGridResult result = new EasyUIDataGridResult();
	List<Item> total=itemService.getAllItem();
	result.setRows(list);
	//鍙栬褰曟�绘潯鏁�
	result.setTotal(total.size());
	System.out.println(result);
	return result;
}
 
//@RequestMapping(value="/item/save", method=RequestMethod.POST)
//@ResponseBody
//private TaotaoResult createItem(TbItem item, String desc, String itemParams) throws Exception {
//	TaotaoResult result = itemService.createItem(item, desc, itemParams);
//	return result;
//}
}
