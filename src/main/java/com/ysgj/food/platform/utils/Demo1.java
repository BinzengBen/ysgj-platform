package com.ysgj.food.platform.utils;

public class Demo1  extends Demo2{
	
	public  String school;
	public static int a=2;
	public static int aa=0;
	
			
	public Demo1(Integer age) {
		System.out.println("5");
		this.age=age;
		
	}
	
	public void Demo1() {
		
	}

    public void test2() {
    	System.out.println("子类方法");
    }
    
    protected static void test3() {
    	System.out.println(a);
    	
    	
    }
	

	@Override
	public void test1() {
		System.out.println("重写父类方法");
	}

	public static void main(String args[]) {	
		System.out.println(aa);
		Demo2 dom = new Demo1(19);
	
				
	}
	
	static {
		System.out.println("666");
	}
	
	

}
