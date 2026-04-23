package jp.co.aforce.sample;

import java.util.Scanner;

public class SwitchScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("曜日の番号（1～7）を入力: ");
		
		if(scanner.hasNextInt()) {
			int day = scanner.nextInt();
			String dayName;
			
			switch(day) {
			case 1:
				dayName = "月";
				break;
			case 2:
				dayName = "火";
				break;	
			case 3:
				dayName = "水";
				break;
			case 4:
				dayName = "木";
				break;
			case 5:
				dayName = "金";
				break;
			case 6:
				dayName = "土";
				break;
			case 7:
				dayName = "日";
				break;
			default:
				dayName  = "無効な番号";
				break;
			}
			System.out.println("今日は " + dayName + " 曜日です。");
				
		}
		
		
		scanner.close();
	}
}


