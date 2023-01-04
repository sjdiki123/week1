package com.iu.s4.Objects3.p1;

public class Member {

	
	// 비만 관리 회원 등록
	private String name;
	public boolean isCheck() {
		return check;
	}


	public void setCheck(boolean check) {
		this.check = check;
	}


	private int age;
	private double ki;
	private double muge;
	private boolean check;
	 
	 public Member() {}
	
	 
	 public Member(int age) {
		 if(age>0 || age <200) {
			 this.age =age;
		 }
	 }
	 //setter메서드
	 //set+변수명의 첫글자 대문자 로 바꾼것
	 public void setAge(int age) {
		if(age>0&&age<200)
		 this.age =age;
	 }
	 
	 //getter 메서드
	 //get++변수명의 찻글자를 대문자로 바꾼것
	 public int getAge() {
		 return this.age;
	 }
	
	 public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getKi() {
		return ki;
	}


	public void setKi(double ki) {
		this.ki = ki;
	}


	public double getMuge() {
		return muge;
	}


	public void setMuge(double muge) {
		this.muge = muge;
	}


	public void info() {
		 System.out.println("Name " +this.name);
		 System.out.println("Age " +this.age);
		 
	 }
	 
	 
}
