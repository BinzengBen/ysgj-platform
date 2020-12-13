package com.ysgj.food.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.ysgj.food.platform.service.FoodsService;

@RestController
@RequestMapping("/foods")
public class FoodsRandomController {
	
	@Autowired
	private FoodsService foodsServiceImpl;
	
	@Autowired
	private FoodsService foodsRandomServiceImpl;
	
	 @PostMapping("/getRandoms")
	 public String getRandom() {
		 String str=foodsRandomServiceImpl.getFoodsRandom();
		 System.out.println(foodsServiceImpl);
		 System.out.println(foodsRandomServiceImpl);
		 System.out.println(foodsServiceImpl.num+1);
		 System.out.println(foodsRandomServiceImpl.num+2);
		 return JSON.toJSONString(str);
	 }

}
