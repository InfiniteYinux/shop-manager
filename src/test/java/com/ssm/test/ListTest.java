package com.ssm.test;

import java.util.List;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.shop.pojo.Item;
import com.ssm.shop.mapper.ItemMapper;
public class ListTest {
	@Test
	public void testPageHelper() {
		//鍒涘缓涓�涓猻pring瀹瑰櫒
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/WEB-INF/applicationContext-*.xml");
		//浠巗pring瀹瑰櫒涓幏寰桵apper鐨勪唬鐞嗗璞�
		 applicationContext.getBean(ItemMapper.class).getBean(ItemMapper.class);
		
		List<Item> list = mapper.selectByExample();
		//鍙栧晢鍝佸垪琛�
		for (Item tbItem : list) {
			System.out.println(tbItem.getTitle());
		}
		//鍙栧垎椤典俊鎭�
		
	
		
	}
}
