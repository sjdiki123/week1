package week1;

import java.util.Scanner;

public class LoopFor3_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		int id= 1234;
		int pw =5678;
		
		
		while (check) {
			System.out.println("1로그인  2 종료");
			int selest= sc.nextInt();
			if(selest==1) {
				
				System.out.println("아이디");
				int yid= sc.nextInt();
				System.out.println("비밀번호");
				int ypw= sc.nextInt();
			if(id==yid&&pw==ypw) {
				System.out.println("로그인 성공");
				break;
			}
			else {
				System.out.println("실패");	
			}
			}
			else {
				System.out.println("종ㄽ") ;
				check=!check;
			}
		}       
		System.out.println("check" +check);
  if (check) {
	    
	  int level = 1;
	  int gold = 0;
	  
	  for (level =1;level<15;level++) {
		  System.out.println("현재레벨"+level);
		  
		  if(level ==5) {
			  System.out.println("5렙 달성 축하금");
			  gold = gold =1000;
		  }
		  if(level ==10) {
			  System.out.println("10렙 달성 축하금");
			  gold = gold =2000;
		  }
		  
		 for (int m=0;m<level*3;m++)  {
			  System.out.println(m+1+"몬스터 샤냥");
		 }
		  
	
		  System.out.println("레벨업");
	  }
	   System.out.println(level + "렙 달성 축하");
	   gold= gold+level/5*1000;
	  System.out.println("gold"+gold);
	  
  }
		
		
		
	}

}
