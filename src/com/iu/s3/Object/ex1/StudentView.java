package com.iu.s3.Object.ex1;

import java.util.Scanner;

public class StudentView {
// list만둘기
	//학생들을 받아서 학생의 정보를 풀력
	//한생 한명을 받아서 학생의 모든 정보를 풀력
	public void viewOne(Student student) {
		System.out.println("Name : "+student.name);
		System.out.println("Num : "+student.num);
		System.out.println("Kor : "+student.kor);
		System.out.println("Eng : "+student.eng);
		System.out.println("Math : "+student.math);
		System.out.println("Total : "+student.total);
		System.out.println("Avg : "+student.avg);
	

}
	

public void viewList(Student [] students) {
	
	
	for(int i =0 ; i<students.length;i++) {
		Student student = students[i];
		//System.out.println(students[i]);
		
		System.out.println("name" +student.name);
		System.out.println("num" +student.num);
		System.out.println("kor" +student.kor);
		System.out.println("eng" +student.eng);
		System.out.println("math" +student.math);
		System.out.println("total" +student.total);
		System.out.println("avg" +student.avg);


	}
}
}
