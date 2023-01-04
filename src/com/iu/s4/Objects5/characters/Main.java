package com.iu.s4.Objects5.characters;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Magition magition = new Magition();
		magition.getMp();
		magition.setMp(0);
		magition.setName("");
		magition.attack();	
		
		Archer archer = new Archer();
		archer.setDex(0);
		archer.setLevel(3);
	    archer.attack();
	}

}
