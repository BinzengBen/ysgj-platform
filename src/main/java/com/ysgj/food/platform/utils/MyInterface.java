package com.ysgj.food.platform.utils;

public interface MyInterface {
	
	abstract void test1() ;
	
	default void test2() {
		System.out.println("nihao");
	};

}
