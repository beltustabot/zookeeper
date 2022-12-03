package com.beltustabot.zookeeper;

public class Bat extends Mammals {
	
	public Bat() {
		super(); 
		energylevel= 300;
	}
	
	public String  fly() {
		energylevel -= 50;
		return "wwwsssshhhhhhhhhh 'Dracula is flying'" ;
	}
	public String eatHumans() {
		energylevel += 25;
		return "chumpchumpchump 'Dracula just ate a whole human'";
	}
	public String attackTown() {
    	energylevel -=100;
    	return "bbwwiiiiigggg 'destroying town'";
    }

}
