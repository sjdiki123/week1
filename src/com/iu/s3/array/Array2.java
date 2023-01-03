package com.iu.s3.array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [ ]ar = new int [3];
		int []ar2 = new int [2];
		
		System.out.println("숫자 입력");

		 int a =sc.nextInt();
		 int []ar3 = new int [a];
 for (int i =0 ;i<1 ;i++) {
		System.out.println( i+1+"숫자 입력");
		 ar3[i] =sc.nextInt();
	 
 }
	
 for(int i =0 ;i<1; i++) {
	 System.out.println(ar3[i]);
	 
 }
 
		 System.out.println(ar);
		
		
	}

}
