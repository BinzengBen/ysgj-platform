package com.ysgj.food.platform.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Demo3 extends DemoAbstract {
	
	public int a=6;
       
	public static void main(String args[]) throws IOException {
		
		Demo3 demo = new Demo3();
		System.out.println(demo.a);
		String path=System.getProperty("user.dir");
		String localPath=path+File.separator+"config"+File.separator+"test2.txt";
		File file = new File(localPath);
		FileReader reader=new FileReader(file);
		System.out.println(reader.read());
		
		ConcurrentHashMap concurrent =new ConcurrentHashMap();
		concurrent.put("fdd", "1");
		Map map=new Hashtable();
		map.put("hh","32");
		
		
	}

	public Demo3() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
}

