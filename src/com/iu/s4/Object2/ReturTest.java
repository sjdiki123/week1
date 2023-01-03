package com.iu.s4.Object2;

import java.util.Random;

public class ReturTest {

	 public void t1() {
		 System.out.println("리턴이 없을때 는 void");
	 }
	
	 public int t2() {
		 Random random= new Random();
		 System.out.println(" 리턴은 int");
		 return  random.nextInt(50);
	 }
	 public int [] t3() {
		int [] ar =new int [3];
		 return ar;
		 
		
	 }
	
}
