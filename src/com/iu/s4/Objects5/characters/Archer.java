package com.iu.s4.Objects5.characters;

public class Archer extends Character {

	
    private int dex;
	
    public Archer() {
    	super();
    	
    }
    
    public void attack() {
 	   System.out.println("활공격");
 	   
    }
   
    
    public void move() {
    	System.out.println("이동");
    }
    
	
	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}
}
