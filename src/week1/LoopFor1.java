package week1;

import java.util.Scanner;

public class LoopFor1 {

	public static void main(String[] args) {
	  
		System.out.println("Strart");
		Scanner sc = new  Scanner(System.in);
		System.out.println("반복문 횟수를 입력");
		int i =0; 
		 
		int a=sc.nextInt();
		for( ;i<a;i++) {
			System.out.println("hello wrold");
			System.out.println("good bye");
			System.out.println(i);
		}
      
		//System.out.println(i);
		System.out.println("finish");

	}

}
