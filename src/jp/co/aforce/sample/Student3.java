package jp.co.aforce.sample;

public class Student3 {
	
	String name;
	int[] grades;
	public Student3(String name, int[] grades) {
		this.name = name;
		this.grades = grades;
	}
	
	String showAverage() {
		int sum = 0;
		
		for(int score : grades) {
			sum += score;
		}
		
		double average = (double) sum / grades.length;
		
		return name + "さんの平均スコアは" + average;

}
}
