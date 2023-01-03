package week1;

import java.util.Scanner;

public class LoopFor3_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new  Scanner(System.in);
       //분과 초 입력 받아서
       //해당 분 초가 되면 반복문을 모두 종료
                     
       for (int b=0;b<60;b++) {
    	   
    	   for (int s =0 ;s<60;s++) {
    		   System.out.println(b+"분"+ s+"초");
    		   
    	   }
       }
	 System.out.println("프로그램 종료");
	}
	

}
