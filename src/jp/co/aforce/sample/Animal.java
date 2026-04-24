package jp.co.aforce.sample;

public class Animal {

	
	void makeSound() {
		System.out.println("Some sound...");
	}
	
}
	
	class Dog extends Animal{
		@Override
		void makeSound() {
			System.out.println("Bark! Bark!");
		}
		
	class Cat extends Animal{
		@Override
		void makeSound() {
			System.out.println("Meow~");
			}
		}
	}
	

