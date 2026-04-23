package jp.co.aforce.sample;

import java.util.Scanner;

public class SwitchScanner2 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("月の番号（1～12）を入力: ");
	
	if(scanner.hasNextInt()) {
		int day = scanner.nextInt();
		String monthName;
		
		switch(day) {
		case 1:
			monthName = "睦月";
			break;
		case 2:
			monthName = "如月";
			break;	
		case 3:
			monthName = "弥生";
			break;
		case 4:
			monthName = "卯月";
			break;
		case 5:
			monthName = "皐月";
			break;
		case 6:
			monthName = "水無月";
			break;
		case 7:
			monthName = "文月";
			break;
		case 8:
			monthName = "葉月";
			break;
		case 9:
			monthName = "長月";
			break;
		case 10:
			monthName = "神無月";
			break;
		case 11:
			monthName = "霜月";
			break;
		case 12:
			monthName = "師走";
			break;
		default:
			monthName = "無効な番号";
			break;
		}
		System.out.println("その月の和名は " + monthName + " です。");
	}
	scanner.close();
	
	}
}
