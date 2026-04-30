package jp.co.aforce.sample.Field;

public class Main {
	
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		
		c1.increment();
        c2.increment();
        c3.increment();
		
		System.out.println("現在のカウント: " + Counter.count);
		
		
	Student.SchoolName  = "Acro学園";
	
	Student s1 = new Student("田辺");
	Student s2 = new Student("片瀬");
	
	System.out.println(s1.name + "さんの学校名: " + Student.SchoolName);
    System.out.println(s2.name + "さんの学校名: " + Student.SchoolName);
	}

}
