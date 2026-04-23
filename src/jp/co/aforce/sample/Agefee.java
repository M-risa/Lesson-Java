package jp.co.aforce.sample;
import java.util.Scanner;

public class Agefee {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("年齢入力: ");
	
	if (scanner.hasNextInt()) {
		int age = scanner.nextInt();
		int fee;
		
		if(age <= 12) {
			fee  = 0;
		} else if (age < 60) {
			fee = 1000;
		} else {
			fee = 500;
		}
		
		System.out.println("入場料は " + fee + " 円です。");
	}
	
	scanner.close();

	}
}
