package com.iu.s4.Object2;

public class MonsterMain {

	public static void main(String[] args) {
		Monster mon1 = new Monster();
		mon1.power=10;
		mon1.hp= 100;
		Monster mon2 = new Monster();
		mon1.power=10;
		mon1.hp= 100;
		
		System.out.println(mon1 == mon2);
		boolean result = mon2.checkValue(mon1);
		System.out.println("Result:" + result);
//		System.out.println(mon1);
//		mon1 .info();
//		System.out.println(mon2);
//		mon2.info();
	}

}
