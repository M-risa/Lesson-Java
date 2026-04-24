package jp.co.aforce.sample;

public class Person1 {
	String name;
	int age;
	
	Person1(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void displayTnfo() {
		System.out.println("名前： " + name + ", 年齢： " + age);
	}

}
