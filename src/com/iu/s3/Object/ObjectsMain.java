package com.iu.s3.Object;

public class ObjectsMain {

	public static void main(String[] args) {
		System.out.println("start");
		 //mian은 프로그램 실행 목적
         // Tset 목적
	     // main 어는 클래스 안에 잇던지 상관 없음
		 //학생 한면 생성
		 //객체 생성
		 //변수 선언과 거의 동일 
		// 클래스명 변수명은 = new 클래스명
		Student student = new Student();
		student.name = "iu";
		student.num = 20;
		System.out.println(student);
		
		System.out.println(student.name);
		System.out.println(student.num);
		System.out.println(student.avg);

		Student student1 = new Student();
		
		student =student1;
		student1.name = "test";

		student1.num = 30;
		System.out.println(student);
		
		System.out.println(student.name);
		System.out.println(student.num);
		System.out.println(student.avg);
		
		System.out.println("finish");

	}

}
