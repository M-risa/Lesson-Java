package jp.co.aforce.sample;

public class Main3 {
	public static void main(String[]arge) {
		int[] grades = {70, 40, 80};
		Student3 s = new Student3 ("田中", grades);
		
//		s.name = "田中";
//		
//		s.grades = grades;
		
		System.out.println("平均点は" + s.showAverage());
	}

}

