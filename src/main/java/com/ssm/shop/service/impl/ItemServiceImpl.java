package com.ssm.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.shop.dao.ItemDao;
import com.ssm.shop.dao.LoginDao;
import com.ssm.shop.pojo.EasyUIDataGridResult;
import com.ssm.shop.pojo.Item;
import com.ssm.shop.pojo.PageParams;
import com.ssm.shop.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao itemDao = null;

	/**
	 * 鍟嗗搧鍒楄〃鏌ヨ
	 * <p>Title: getItemList</p>
	 * <p>Description: </p>
	 * @param page
	 * @param rows
	 * @return
	 * @see com.taotao.service.ItemService#getItemList(long, long)
	 */
	@Override
	public List<Item> getItemList(PageParams pageparams) {
		return itemDao.getItemList(pageparams);
	}

	@Override
	public Item getItemById() {
		// TODO Auto-generated method stub
		return itemDao.getItemById();
	}

	@Override
	public List<Item> getAllItem() {
		// TODO Auto-generated method stub
		return itemDao.getAllItem();
	}



}
