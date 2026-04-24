package jp.co.aforce.sample;

public class Class1 {
	public static void main(String[] args) {
		Dog myDog = new Dog("ポチ");
		
		System.out.println("犬の名前は" + myDog.name);
	}

}



class Dog{
	String name;
	
	public Dog(String name) {
		this.name = name;
	}
}