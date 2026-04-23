package jp.co.aforce.sample;
import java.util.Scanner;

public class IfScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("整数を入力");
		
		System.out.print("判定する値: ");
        int nember = scanner.nextInt();
		
		if(nember % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
		
		if(nember > 0) {
			System.out.println("正の数");
		} else {
			System.out.println("負の数");
		}
		
		
		
		System.out.println("3つの辺の長さを入力してください（整数）");
		
		System.out.print("1つ目の辺: ");
        int a = scanner.nextInt();
        System.out.print("2つ目の辺: ");
        int b = scanner.nextInt();
        System.out.print("3つ目の辺: ");
        int c = scanner.nextInt();
		
		if(a + b > c && a + c > a && b + c > a) {
			System.out.println("三角形である。");
		} else {
			System.out.println("三角形出ない。");
		}
		
		scanner.close();
		

				
	}

}
