package jp.co.aforce.sample;

public class Animal7 {
	public void makeSound() {
		System.out.println("動物が鳴いてます");
	}
}
	
	class Dog7 extends Animal7{
		@Override
		public void makeSound() {
			System.out.println("ワンワン！");
		}
	}
		
	class Cat7 extends Animal7 {
		@Override
		public void makeSound() {
			System.out.println("ニャーニャー");
		}
	}


