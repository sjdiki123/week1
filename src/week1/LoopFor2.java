package week1;

public class LoopFor2 {

	public static void main(String[] args) {
	//반복문내의 보조문
		//1.break
		// 반복문 내에서 break만나면 그 즉시  반복문을 종료한다
		for (int i = 0;i<10;i++) {
			System.out.println(i);
			if(i%4==3) {
				break;
			}
			
		}
		System.out.println("종료");
		//2.continue;
		//반복문 내에서
		//1) for 그 즉시 증감식
		//2) while 즉시 조건식
    
	}

}
