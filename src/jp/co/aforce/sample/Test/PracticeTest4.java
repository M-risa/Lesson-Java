package jp.co.aforce.sample.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class PracticeTest4 {
	public static void main(String[] args) {
		
		//問１
		ArrayList<String> animals = new ArrayList<>(Arrays.asList("犬", "猫", "兎", "蛇"));
		
		//問２
		String searchAnimals  = "猫";
		
		if(animals.contains(searchAnimals)) {
			System.out.println(searchAnimals + "はリストに含まれてます");
		} else {
			System.out.println(searchAnimals + "はリストに含まれていません");
		}
		
		
		//問３
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH) + 1;
		
		switch(month) {
		case 1:
			System.out.println("冬物セール");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("春物を売る");
			break;
		case 5:
			System.out.println("冬物セール");
			break;
		case 6:
		case 7:
			System.out.println("夏物を売る");
			break;
		case 8:
			System.out.println("夏物セール");
			break;
		case 9:
			System.out.println("秋物を売る");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("冬物を売る");
			break;
		
			default:
				System.out.println("不正な月です");
				break;
		}
	}

}
