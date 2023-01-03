package com.iu.s3.Object;

import java.util.Scanner;

public class ObjectsMain3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("학생수를 입력하세요");
	int count = sc.nextInt();
		
	Student student=null;
	
	Student []students = new Student[count];
	
 for (int i =0 ;i<student.length;i++) {
		student  = new  Student();
		System.out.println(i+1+"번재 학생의 이름을 입력");
    student.name = sc.next();
    students[i]= student;
 }
	
 
 for (int i = 0; i < student.length;i++) {
	 System.out.println(students[i].name);
	 
 }
 
 
 System.out.println(" 종료");
 
		
		
	}

}
