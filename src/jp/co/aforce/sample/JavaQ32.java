package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaQ32 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(30);//重複
		numbers.add(40);
		numbers.add(10);//重複
		numbers.add(50);
		
		Set<Integer> set = new HashSet<>(numbers);
		
		System.out.println(set);

}
}
