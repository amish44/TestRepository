package com.amish.project1;

//RULE: Super class reference can store derived class object
//Rule: Private member can not be inherited to derived class
public class Person {
	private int age;
	private String name;
	
	public Person() {
		this.age=1;
	}
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
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

	public void printData() {
		System.out.println(age);
		System.out.println(name);
	}
	
}	
