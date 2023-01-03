package com.iu.s3.Object;

public class ObjectsMain2 {
public static void main(String[] args) {
	
	Sword s1 = new Sword();
	 s1.name = "집행검";
	 s1.a = 50;
	 s1.b= 200;
	 s1.c =5000;
	 s1.d = 3;
	 
	 Knight s2= new Knight();
	 s2.name ="기사";
	 s2.hp = 100;
	 s2.pw= 100;
	 s2.sp = 100;
	 s2.iq=50;
	
	 s2.sword=s1;
	 
	 System.out.println(s2.sword.name);
	 
}
}
