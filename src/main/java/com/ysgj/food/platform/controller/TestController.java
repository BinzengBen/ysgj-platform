package com.ysgj.food.platform.controller;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestController {
	
	public static void main(String args[]) throws NoSuchAlgorithmException {
		 System.out.println(
			        "欢迎来到疯狂动物城! ");
			    //调用其他类中声明的方法
			    //调用了 MethodDemo07中的gen方法
			    char[] answer=gen(5);
			    System.out.println(answer); 
			    int num=-1, loc=-1, score=600;
			    Scanner in = new Scanner(System.in);
			    do{
			        System.out.print("猜吧:");
			        //获取用户输入的一串字符
			        String str=in.nextLine();
			        //将String 类型的数据转换为char[]
			        //toCharArray是Java提供的方法.
			        char[] input=str.toCharArray();
			        //equals 是Java提供的比较字符字符串
			        //是否相等的方法, 这里用于判断是否是exit
			        if(str.equals("exit")){
			            System.out.println("废材"); 
			            break;
			        }
			        //比对用户输入 input 和 answer的关系
			        int[] result=match(answer, input);
			        num = result[0];//匹配字符数
			        loc = result[1];//匹配位置数
			        //输出比对结果
			        System.out.printf(
			            "猜中字符%-1d个,猜中位置%-1d个,得分%-8d\n",
			            num, loc, score);
			        //计分处理
			        score-=10;
			        //检查分数
			        if(score==0){
			            System.out.println("Game Over!");
			            break;
			        }
			    }while(num!=5 || loc!=5);//没猜中继续猜   

			    if(num==5 && loc==5){
			        System.out.println("天下无双!");
			    }
			}
			/*
			 * 比对猜测字符的位置
			 */
			public static int[] match(
			    char[] answer, char[] input){
			    int num=0;//猜中字符的个数
			    int loc=0;//猜中字符的位置数
			    //i 代表 answer中字符的位置 0~4
			    for(int i=0; i<answer.length; i++){
			        //j 代表input中字符的位置 0~4
			        for(int j=0;j<input.length; j++){
			            //比较每两个字符
			            if(answer[i]==input[j]){
			                num++;//找到猜中的字符
			                //字符一样再比较位置
			                if(i==j){
			                    //位置相同loc加一
			                    loc++;
			                }
			                break;//找到一样字符就无需再查找
			            }
			        }
			    }
			    return new int[]{num, loc};
			}
			
			public static char[] gen(int n){
			    char[] chs={'A', 'B', 'C', 'D', 'E'
			            , 'F', 'G', 'H', 'J', 'K'
			            , 'L', 'M', 'N', 'P', 'Q'};
			    boolean[] used = 
			        new boolean[chs.length];
			    char[] ary = new char[n];
			    for(int index=0;
			        index<ary.length; index++){
			        //生成随机数, 不重复的随机数
			        int i;
			        do{
			            i=(int)(Math.random()*chs.length);
			        }while(used[i]);
			        //抽取一个字符
			        ary[index]=chs[i];
			        //标记这个字符已经被使用
			        used[i]=true;
			    }
			    return ary;
			}

}
