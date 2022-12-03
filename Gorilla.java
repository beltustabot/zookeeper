package com.beltustabot.zookeeper;

public class Gorilla extends Mammals {

	public Gorilla() {
		super();		
	}
	
    public String throwSomething() {
    	energylevel -=5;
    	return "Gorilla threw a tree at you";
    }
    public String eatBananas() {
    	energylevel += 10;
    	return "banana yum";
    }
    public String  climb() {
    	energylevel -= 10;
    	return "Gorilla is climbing a tree" ;
    }
    
}
