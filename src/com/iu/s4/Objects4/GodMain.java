package com.iu.s4.Objects4;

public class GodMain {

	public static void main(String[] args) {
		
//singleㅆon 디자인 패턴

	God god =	God.getInstance();	
	god.setName("유일신");
		
	
	System.out.println("God : "  +god);
	System.out.println("Name : "  +god.getName());
		
	
	
	god = God.getInstance();	
	
	System.out.println("God : "  +god);
	System.out.println("Name : "  +god.getName());
		
	
	
	}
	

	

}
