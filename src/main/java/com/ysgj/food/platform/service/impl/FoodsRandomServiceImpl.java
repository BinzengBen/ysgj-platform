package com.ysgj.food.platform.service.impl;

import org.springframework.stereotype.Service;

import com.ysgj.food.platform.service.FoodsService;

@Service
public class FoodsRandomServiceImpl implements FoodsService{

	@Override
	public String getFoodsRandom() {
		System.out.println("随机6种食物");
		return "随机6种食物";
	}
	
	
	

}
