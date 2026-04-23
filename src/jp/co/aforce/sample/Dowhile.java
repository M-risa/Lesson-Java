package jp.co.aforce.sample;

import java.util.Scanner;

public class Dowhile {
	public static void main(String[] args) {
		
		//問1
		int o = 0;
		do {
			System.out.println(o);
			o++;
		} while(o <= 10);
		
		
		//問2
		int t = 1;
		int sum = 0;
		
		do {
			sum += t;
			t++;	
		} while(t <= 100);
		
		System.out.println(sum);
		
		
		//問3
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		int input;
		
		System.out.println("整数: ");
		
		do {
			System.out.print("整数を値入力：");
			input = scanner.nextInt();
			sum += input;
		} while(input != 0);
		
		System.out.println("計 "+ score );
		
		scanner.close();
		
	}
}
	

