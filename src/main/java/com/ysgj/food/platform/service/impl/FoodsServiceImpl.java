package com.ysgj.food.platform.service.impl;

import org.springframework.stereotype.Service;

import com.ysgj.food.platform.service.FoodsService;

@Service
public class FoodsServiceImpl implements FoodsService{
	
	public  int a=1;

	@Override
	public String getFoodsRandom() {
		System.out.println("有很多食物");
		return "goods";
	}
			
	

}
