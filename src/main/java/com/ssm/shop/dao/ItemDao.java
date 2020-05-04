package com.ssm.shop.dao;

import com.ssm.shop.pojo.Item;
import com.ssm.shop.pojo.PageParams;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface ItemDao {
	public List<Item> getItemList(PageParams pageparams);
public Item getItemById();
public List<Item> getAllItem();
}