package com.amish.project1;

public class Student {
	
	//members/variables/attribute
	private int id;
	private String name;
	private int age;

	public Student() {
		
	}
	
	//Parameterized constructor overridden the default one
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	//Overloading above constructor by changing parameter
	public Student(String abc, int age) {
		this.age = age;
		this.name = abc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//member function/method/behaviour
	public void exam() {
		
	}
	
	public void read() {
		
	}
	
}
