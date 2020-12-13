package com.ysgj.food.platform.utils;

public class Demo2 {
	
	public String name;
	public Integer age;
	
	
	
	public Demo2(String name) {
		this.name=name;
		System.out.println("1");
		
	}
	
	public Demo2() {
		System.out.println("无参构造器");
	}
	
	static {
		System.out.println(8);
	}
	
	public void test1() {
		System.out.println("父类方法");
	}

	public Demo2(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

}
