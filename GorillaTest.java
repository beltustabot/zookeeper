package com.beltustabot.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla kong = new Gorilla();
		
		System.out.println(kong.throwSomething());
		System.out.println(kong.throwSomething());
		System.out.println(kong.throwSomething());
		System.out.println(kong.eatBananas());
		System.out.println(kong.eatBananas());
		System.out.println(kong.climb());
		System.out.println("The energy level is: " + kong.displayEnergy());

	}
	
	
	

}
