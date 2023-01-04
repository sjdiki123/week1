package com.iu.s4.Objects4;

public class Card {

	
	//card
	private String shape ;
	private	int number;
	private	String color;
	
	//클래스 변수
	 public static	int size= 10;
	 
	 //instance초기화 블록
	 {}
	 // static 초기화블록
	 static {
		 Card.size=50;
	 }
	 //클래스메소드
	 public static void staticMethod() {
		 Card.size=10;
		 System.out.println("static Method");
		// System.out.println(this.shape);
		 //this.info();
		 Card card = new Card();
		 card.info();
	 }
	 
	public void info() {
		System.out.println("Shape:" + this.shape);
		System.out.println("color:" + this.color);
		System.out.println("number:" + this.number);
		System.out.println("Size:" + Card.size);
		Card.staticMethod();

		
	}
	
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
}
