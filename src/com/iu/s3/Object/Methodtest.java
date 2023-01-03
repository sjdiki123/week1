package com.iu.s3.Object;

public class Methodtest {

	// 메서드 선언 공식
	//public static void main(String[] args){}
	//접근 지정자 그외지정자 리턴 타입 메서드 명(매개변수들  선언){}
	
	//접근 지정자 :public
	// 그외 지정자 : 생략
    // 리턴 타입 :void
	// 메서드명 : 작명 
	//매개변수 : 생략
	//
	public void t1 () {//메서드의 header
		//{}메서드의 body,내용
		//제어문 ,반복문,등등
		Methodtest2 mt2 = new Methodtest2();
		
		mt2.info();
		System.out.println("t1 메서드 실행");
		int num =10;
		System.out.println("t1 num"+num);
		System.out.println("t1 메서드 종료");

		
	}
	public void t2 () {
	
	System.out.println("t2 메서드 실행");
	int num =20;
	System.out.println("t2 num"+num);
	System.out.println("t2 메서드 종료");
	
}
}