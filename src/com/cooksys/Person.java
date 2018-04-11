package com.cooksys;

public class Person {
	
	private int age;
	private String name;
	
	public Person () {}
	
	public Person (int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public Person (int age) {
		this.age = age;
	}

	public static void speak (String sentence) {
		System.out.println(sentence);
	}
	
	public void speak (String sentence, String punctuation) {
		System.out.println(sentence + punctuation);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
