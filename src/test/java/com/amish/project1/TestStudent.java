package com.amish.project1;

public class TestStudent {

	public static void main(String[] args) {
		Student student;
		student = new Student();
		System.out.println(student.getId());
		student.setAge(4);
		System.out.println(student.getAge());
		
		//Another object
		Student student1 = new Student(1,"ABC",5);
		System.out.println(student1.getId());
		
		Student studennt2 = new  Student("ABC",5);
		
	}

}
