package com.ysgj.food.platform.controller;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.ysgj.food.platform.dao.DccpPageMapper;
import com.ysgj.food.platform.entity.DccpPage;
import com.ysgj.food.platform.entity.Foods;
import com.ysgj.food.platform.service.FoodsService;
import com.ysgj.food.platform.service.impl.FoodsServiceImpl;
import com.ysgj.food.platform.utils.DccpLogger;

@RestController
@RequestMapping("/foods")
public class FoodsController {
	
	private static final DccpLogger LOGGER = DccpLogger.getLogger(FoodsController.class);
	
	@Autowired
	private DccpPageMapper dccpPageMapper;
	
	@Autowired
	private FoodsService foodsServiceImpl;
	
	@Autowired
	DataSource dataSource;
		
	 @PostMapping("/getDetail")
	 public String getDetail(@RequestBody String foodId) {
		 
		 Foods foods =new Foods();
		 foods.setCreateTime(new Date());
		 foods.setFoodCode("ab123");
		 foods.setFoodId(123);
		 foods.setFoodName("大baicai");
		 foods.setImageId(256l);
		 foods.setImageUrl("www.baidu.com");			
		 return JSON.toJSONString(foods);
		 
		 
	 }
	 
	 @PostMapping("/getPage")
	 public String getPage(@RequestBody DccpPage page) {
		 try {
			System.out.println("获取的数据库连接为:"+dataSource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(page.getPageId());
		 System.out.println(dccpPageMapper);
		 DccpPage page2=dccpPageMapper.selectByPrimaryKey(page.getPageId());
		 List<DccpPage> list = dccpPageMapper.selectAll();
		 DccpPage page1 =new DccpPage();
		 page1.setPageId("1");
		 page1.setCreateTime(new Date());
		 dccpPageMapper.updateByPrimaryKeySelective(page1);
		 System.out.println(list);
		 System.out.println(page);
		 System.out.println(list.size());
		 return JSON.toJSONString(page2);
	 }
	 
	 @PostMapping("/getRandom")
	 public String getRandom() {
		 String str=foodsServiceImpl.getFoodsRandom();		
		 System.out.println(foodsServiceImpl);		
		 System.out.println(foodsServiceImpl.num+1);
		 return JSON.toJSONString(str);
	 }

}
