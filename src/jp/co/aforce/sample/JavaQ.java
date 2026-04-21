package jp.co.aforce.sample;

import java.util.Scanner;

public class JavaQ {
	public static void main(String[] args) {
		
	int num = 10;
	System.out.println(num);
	
	int a = 8;
	int b = 5;
	int sum  = a + b;
	System.out.println(sum);
	
	int width = 7;
	int height = 4;
	int area = width * height;
	System.out.println(area);
	
	String name = "Java";
	double version = 17.0;
	boolean isFun = true;
	
	System.out.println(name);
	System.out.println(version);
	System.out.println(isFun);
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("名前を入力してください");
		
	String Name = scanner.nextLine();
	System.out.println("こんにちは、" + Name + "さん！");


	}
}


