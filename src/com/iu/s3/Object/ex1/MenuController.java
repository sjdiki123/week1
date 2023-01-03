package com.iu.s3.Object.ex1;

import java.util.Scanner;

public class MenuController {

	Scanner sc = new Scanner(System.in);
	
	public void  Start() {
		boolean check = true; 
		StudentInput si = new StudentInput();
		StudentView si1= new StudentView();

		System.out.println(" 학생수를 입력하세여");
		int count = sc.nextInt();
		Student [] students = new Student [count];
		
		while (check) {
			
			  System.out.println("1학생 정보 일력");
			  System.out.println("2학생 검색 정보 출력");
			  System.out.println("3학생 전체 정보 출력");
			  System.out.println("4학생추가");
			  System.out.println("5종료");
			  int select = sc.nextInt();
			  
			  switch(select) {

			  case 1:
				  System.out.println("등록합니다");
				  si.setallStudents(students);
				  break;
			  case 2:
				  System.out.println();
				Student student= si.findStudent(students);
				 if(student !=null) {
				
					si1.viewOne(student);
				 }else{
				 System.out.println(" 없어여");
					 
				 }
				  break;
				  
			  case 3:
				  System.out.println();
				  si1.viewList(students);
				  break;
			  case 4:
					students= si.setStudent(students);
                          System.out.println(" 추가 합니다");
				  
			  break;
				  
			 default:
				 System.out.println("종료합니다");
				 check  =false;
				  
				 break;
			  }
		  }	 
	}
	
	// start
	//1. 등록
//2 수정 
	//3 삭제 
	//4 종료
}
