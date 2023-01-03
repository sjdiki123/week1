package com.iu.s3.array;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [ ]ar = {5,1,4};
		//1.데어터 추가
		//2데어터 삭제
		//3종료 졸리다          

		
		//while(check) {
			System.out.println("1추가 2 삭제 3 종료");
			int select = sc.nextInt();
			
			if(select ==1) {
				System.out.println("배열에 데이터 추가 코드 작성");
				int [ ] copy  = new int [ar.length+1];
				copy[0] = select;
			}else if (select==2) {
				System.out.println("배열에 잇는 삭체 코드 ");
				int[] copy = new int [ar.length-1];
			}  
		
		else {
			System.out.println(" 종료 ");
			//break
		}  
	
		}
	
}

