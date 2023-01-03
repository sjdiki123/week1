package week1;

import java.util.Scanner;

public class LooFor_ex3 {

	public static void main(String[] args) {
	
		Scanner sc = new  Scanner(System.in);
		System.out.println(" 로그인 하세요");
		int id = 1234;
		int pw = 5678;
	boolean check = false;
		
		for(int i=0;i<5;i++) {
				System.out.println("아이디");
			int	yid=sc.nextInt();
				System.out.println("비밀번호");
			int	ypw=sc.nextInt();
		if(yid==id&&ypw==pw) {
			System.out.println("성공");
			check = true;
			i=5;
		}
		else {
			System.out.println("실패");
			
		}
		if(check) {
		System.out.println("환영합니다");
		}
		else {
		System.out.println("은행에 방문해주세여");
		}
		System.out.println("반복문 종료");
		
		
	}

}
}