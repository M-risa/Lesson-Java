package jp.co.aforce.sample;

import java.util.Scanner;

public class Number1 {
	public static void main(String[] args) {
		
//		try(Scanner scanner = new Scanner(System.in)){
//			System.out.print("整数を入力");
//			
//			String input = scanner.next();
//			int num = Integer.parseInt(input);
//			
//			int result = num / 2;
//			System.out.println("結果: " + result);
//			
//		}catch(NumberFormatException e) {
//			System.out.println("エラー：整数を入力してください。");
//		}

		
//	        try {
//	            int result = 10 / 0;
//	            System.out.println("計算結果: " + result);
//	        } catch (ArithmeticException e) {
//	            System.out.println("例外が発生しました: " + e.getMessage());
//	        }
//	        System.out.println("プログラム終了");
			
       //問5 
		int x = 10;
		try {
			int result5 = x / 0;
			System.out.println("計算結果：" + result5);
			
			}catch(ArithmeticException e) {
				System.out.println("0で割ることはできません");
			}
		
		
	  //問6		
		try {
			int[]nums = {1, 2, 3};
			System.out.println(nums[3]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("配列は範囲外です。");
		}
		
		
		//問７
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print("整数を入力");
			String input7 = scanner.next();
			
			int num7 = Integer.parseInt(input7);
			int result = 10 / num7;
			
			System.out.println("10 ÷ " + num7 + " = " + result);
			
		}catch(NumberFormatException e) {
			System.out.println("エラー：整数を入力してください。");
			
		}catch(ArithmeticException e) {
			System.out.println("エラー：0で割ることはできません。");
		}
	}
}
