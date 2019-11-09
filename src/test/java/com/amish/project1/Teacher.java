package com.amish.project1;

public class Teacher extends Person{
	int id;
	
	public Teacher() {
		
	}
	
	public Teacher(int id, String name, int age) {
		super(age,name);
		this.id = id;
	}
	
	public Teacher(int id) {
		//this will call super class default constructor
		super();
		this.id = id;
	}

	public void printData() {
		System.out.println(this.id);
		System.out.println(this.getName()); 
		System.out.println(this.getAge());
	}
	
	public static void main(String args[]) {
		Teacher teacher1 = new Teacher();
		teacher1.printData();
		
		System.out.println("----------------------------");
		//id =2
		Teacher teacher = new Teacher(2);
		teacher.printData();
		
		System.out.println("----------------------------");

		//
		Teacher teacher2 = new Teacher(12, "onetwo", 123);
		teacher2.printData();
	}
}
