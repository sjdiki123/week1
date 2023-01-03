package com.iu.s3.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		//1. 학생수 입력
		//2 .학생 수 만큼 이름을 입력
		//3 학생수 만큼 학생의 번호 ,국어,영어 ,수학 입력
		//모든 학생 정보 출력 이름 번호 국어 영어 수학	
		//총점 평균 게산
		Scanner sc = new Scanner(System.in);
		int []ar = new int[0];
		int []ar2	 = new int[0];
		System.out.println("학생수 를 입력해주세요");
		
		int a =sc.nextInt();
		int []ar3 = new int [a];
		// int [] nums = new int [];
		 String[] names = new String[a];
		  for (int i =0 ;i<a ;i++) {
			  System.out.println(i+1+"학생 이름을 입력하세요");
				 String name =sc.next();
						  }
		
		  
		//for(int i = 0 ; i <names)
		  
		  
	}

}
