package com.iu.s3.Object.ex1;

import java.util.Scanner;

public class StudentInput {
	
	
	//findStudent
	//학생배열을 받아서 
	//학생의 번호를 일력받아서 일치 하는 학생을 리턴 없으면 null
	public Student findStudent(Student [] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 학생 번호 입력");
		int num =sc.nextInt();
		for(int i=0;i<students.length;i++) {
			if(num==students[i].num) {
				return students[i];
			}
		}
		
		return null;
		
	}
	
	
	
	
	
	
	

	//setstudent
	//학생 한명 객체를 생성해서 ,이름,번호,국어,영어,수학 입력
	//총점 평균
	
	public Student[] setStudent(Student [] students) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("이름");
		  student.name=sc.next();
		System.out.println("번호입력");  
		  student.num=sc.nextInt();
		System.out.println("국어입력");
		  student.kor=sc.nextInt();
		System.out.println("영어입력");
		  student.eng=sc.nextInt();
		System.out.println("수학입력" );
		  student.math=sc.nextInt();
		
		  
		  student.total=student.kor+student.eng+student.math;
			student.avg = student.total/3.0;
		  
			Student [ ] newStudent = new Student[students.length+1];
			for (int i =0 ;i<students.length;i++) {
				newStudent[i] = students[i];
			
				
		}
	newStudent[students.length] = student;
	return newStudent;
			
			
	}
	

	
	//setallstudents
	//매개변수로 학생배열 받아서
	//배열의 수만큼 학생 객체를 생성해서 이름 번호 점수 입력 
	//총점 평균
	//학생객체를 배열에 대입
	
	
	public void setallStudents(Student [ ] students) {
		Scanner sc = new Scanner(System.in);
for(int i=0 ;i<students.length;i++) {
	Student student = new Student();
	System.out.println("이름");
	  student.name=sc.next();
	System.out.println("번호입력");
	  student.num=sc.nextInt();
	System.out.println("국어입력");
	  student.kor=sc.nextInt();
	System.out.println("영어입력");
	  student.eng=sc.nextInt();
	System.out.println("수학입력" );
	  student.math=sc.nextInt();
	
	  student.total=student.kor+student.eng+student.math;
		student.avg = student.total/3.0;
		
		students[i]=student;
	
	
	
	
}
	}
	
	
	
	
	
	
}
