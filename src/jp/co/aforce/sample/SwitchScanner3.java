package jp.co.aforce.sample;

import java.util.Scanner;

public class SwitchScanner3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("学生の成績（A, B, C, D, F）を入力: ");
		
		String grade = scanner.next();
			
			switch(grade.toUpperCase()) {
			case "A":
				System.out.println("優");
				break;
			case "B":
				System.out.println("良");
				break;
			case "C":
				System.out.println("可");
				break;
			case "D":
				System.out.println("不可");
				break;
			case "F":
				System.out.println("再");
				break;
			default:
				System.out.println ( "無効な番号");
				break;
			}
			scanner.close();
			
		}
	}

