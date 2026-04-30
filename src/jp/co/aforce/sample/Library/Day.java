package jp.co.aforce.sample.Library;

import java.time.LocalDate;

public class Day {
	public static void main(String[] args) {
		
		//問１
		LocalDate today = LocalDate.now();
		System.out.println("今日の日付：" + today);
		
		LocalDate nextWeek = today.plusWeeks(1);
		System.out.println("1週間後の日付: " + nextWeek);
		
		
		//問２
		int value = -10;
		
		int result = Math.abs(value);
		System.out.println("-10の絶対値は: " + result);
	}
	
	

}
