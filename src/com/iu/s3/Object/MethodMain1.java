package com.iu.s3.Object;

public class MethodMain1 {

	public static void main(String[] args) {
	System.out.println("메인 메서드 실행");
		Methodtest mt = new Methodtest();
		Methodtest3 mt3 = new Methodtest3();
		
		int salary = 3000000;
		//매개변수로 보낸값 인자갑ㅅ
		mt3.t3(salary,0.95);
		
		//mt3.i
		System.out.println("메인" +salary);
		//메서드를 호출한다
		//mt .t1();
		//mt .t2();

		System.out.println("메인 메서드 종료");

		
		
		
	}

}
