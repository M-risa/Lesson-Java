package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFruit {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		for (int i = numbers.size() - 1; i >= 0; i--) {
			System.out.println(numbers.get(i));
		}
	}

}
