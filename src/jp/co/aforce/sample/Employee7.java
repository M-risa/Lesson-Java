package jp.co.aforce.sample;

public class Employee7 {
	 int id;
	 String name;
	 
	 public Employee7(int id, String name){
		 this.id = id;
		 this.name = name;
	 }
	 
	 @Override
	 public boolean equals(Object obj) {
		 if(obj instanceof Employee7) {
			 Employee7 other = (Employee7) obj;
			 return this.id == other.id;
		 }
		 return false;
	 }

}
