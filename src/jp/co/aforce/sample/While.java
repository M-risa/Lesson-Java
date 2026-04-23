package jp.co.aforce.sample;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		
		//問1
		System.out.println("問1");
		
		int o = 0;
		while(o <= 10){
			System.out.println(o);
			o++;
		}
		
		//問2
		System.out.println("問2");
		
		int t = 1;
		int sum = 0;
		
		while(t <= 100) {
			sum += t;
			t++;
		}
		System.out.println(sum);
		
		
		//問3
		System.out.println("問3");
		
		Scanner scanner = new Scanner(System.in);
		int score = 0 ;//合計を蓄積させる変数
		
		System.out.println("整数を入力: ");
		int input = scanner.nextInt();
		
		while(input != 0) {
			score += input;
			System.out.print("次の数値(0で終了)");
			input = scanner.nextInt();
		}
		System.out.println("ここまでの合計は " + score + " です。");
        scanner.close();
		

	}
	
}
