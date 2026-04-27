package jp.co.aforce.sample;

public class Main7 {
	public static void main(String[] args) {
		Person61 person  = new Person61("田中", 25);
		
		person.displayInfo();
		
		Car car = new Car("フェラーリ", "赤");
		
		car.display();
		
		Book book = new Book("燃えよ剣", "司馬遼太郎");
		book.displayInfo();
		
		
		Dog7 myDog = new Dog7();
		System.out.print("犬の鳴き声: ");
        myDog.makeSound();
        
        Cat7 myCat = new Cat7();
        System.out.print("猫の鳴き声: ");
        myCat.makeSound();
        
        
        Person7 persons = new Person7("田中", 25);
        System.out.println(persons.toString());
	
	Employee7 emp1 = new Employee7(101, "田中");
	Employee7 emp2 = new Employee7(101, "田中");
	Employee7 emp3 = new Employee7(103, "田中");
	
	System.out.println("emp1 と emp2 は同じ？ : " + emp1.equals(emp2)); 
    System.out.println("emp1 と emp3 は同じ？ : " + emp1.equals(emp3));
	}
}


