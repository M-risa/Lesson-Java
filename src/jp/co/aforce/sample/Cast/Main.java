package jp.co.aforce.sample.Cast;

public class Main {
	public static void main(String[] args) {

		Animal myAnimal = new Dog();
		Dog myDog = (Dog) myAnimal;
		
		myDog.bark();
	}

}
