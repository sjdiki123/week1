package com.iu.s4.Object2;

import java.util.Scanner;

public class Car {

	String name ;
	static String company;
	int price;
	String color;
	
	{
		//초기화 블럭
		System.out.println("초기화블럭" + this.company);
		this.company = " audi";
	}
	public Car() {
	//	this ("black");
		System.out.println("생성자 "+ this.company);
		this.company = "기아";
		this.name = "스포티치";
		this.price = 3500;
		this.color = "black";
		
	}
	
	public Car(String color) {
		this(color ,3500);
//		this.company = "기아";
//		this.name = "스포티치";
//		this.price = 3500;
//		this.color = color;

	}
	public Car(String color,int price) {
		this(color ,price,"스포티지");
//		this.company = "기아";
//		this.name = "스포티치";
//		this.price = price;
//		this.color = color;
		
		

	}
	
	public Car(String color,int price ,String name) {
		this.company = "기아";
		this.name = name;
		this.price = price;
		this.color = color;
		
	}
	public void info() {
		System.out.println("name" + this.name);
		System.out.println("company" + this.company);
		System.out.println("price" + this.price);
		System.out.println("color" + this.color);
	

	}

}
