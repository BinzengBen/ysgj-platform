package com.ysgj.food.platform.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DataSourceTest {
	//标注图片是否下载完毕
   
	public static void main(String[] args) {
		ExecutorService threadPool
		= Executors.newFixedThreadPool(3);
	
	for(int i=0;i<5;i++){
		Runnable runn = new Runnable(){
			public void run(){
				Thread t = Thread.currentThread();
				System.out.println(t+"正在执行任务!");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(t+"执行任务完毕!");
			}
		};
		//将任务指派给线程池
		threadPool.execute(runn);
		System.out.println("将任务交给线程池了!");
	}
	/*
	 * 关闭线程池,但是是等到线程池中的
	 * 所有任务都执行完毕后
	 */
	threadPool.shutdown();
	System.out.println("very good");
	/*
	 * 立刻关闭线程池,线程池中所有在运行
	 * 的线程都会被强制中断
	 */
//	threadPool.shutdownNow();
	System.out.println("线程池结束了!");
  }
}
			



