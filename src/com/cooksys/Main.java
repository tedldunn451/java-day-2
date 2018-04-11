package com.cooksys;

public class Main {

	public static void main(String[] args) {
		Plane p = new Plane(new Person(23, "Will"), "jet");
		
		System.out.println(p.toString());
	}

}
