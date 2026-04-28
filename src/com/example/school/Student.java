package com.example.school;

public class Student {
	String name;
	int grade;
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public void introduce() {
        System.out.println("私の名前は" + name + "です。" + grade + "年生です。");

	}
}
