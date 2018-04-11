package com.cooksys;

public class Car extends Vehicle {

	@Override
	public void move(Person Driver, int distance) {
		System.out.println(Driver.getName());
	}

	@Override
	public void honk(String sound) {
		System.out.println("honk honk");
	}
	
	

}
