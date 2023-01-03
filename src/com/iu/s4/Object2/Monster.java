package com.iu.s4.Object2;

public class Monster {

	//멤버 변수  instance변수
	int power =10 ;
	int hp=100;
	
	//생성자 Constructor
	
	public Monster() {
		//매개변수가 없는 생성자를 기본 생성자 
		this.power=50;this .hp = 60;
		System.out.println(" 생성자 실행");
	}
	
	
	public Monster(int power ) {
		
	}
	// 멤버메서드,instance method
	
	
	public boolean checkValue(Monster monster) {
		//나의power와 같고  hp같으면 true 리턴
		if(monster.hp==this.hp&&monster.power==this.power){ 
//			this.power=power;
//			this.hp = hp;		
			return true;
		}
		else {
			
		return false;
		}
	}
	
	
	public void info() {
		System.out.println(this);
		//참조 변수this : class 내부에서만 사용가능 생성된 객체 주소 담음
		System.out.println(this.power);
		//this생략 가능
		System.out.println(hp);
		
		this.atttack();
	}
	
	public void atttack() {
		System.out.println(" 공격합니다");
		
	}
	
	
	public void setHp(int hp) {
		this.hp=hp;
	}
	
	
}
