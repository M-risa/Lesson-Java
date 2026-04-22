package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JavaList {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(25);
		numbers.add(32);
		numbers.add(45);
		
		int target = 25;
		
		if(numbers.contains(target)) {
			System.out.println(target + " はリストに含まれています。");
        } else {
            System.out.println(target + " はリストに含まれていません。");
        }
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		
		System.out.println("ソート前: " + fruits);
		
		Collections.sort(fruits);
		
		System.out.println("ソート後: " + fruits);
		
		LinkedList<String> animals = new LinkedList<>();
		animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");
        animals.add("Panda");
        
        String first = animals.getFirst();
        String last = animals.getLast();

        System.out.println("リスト全体: " + animals);
        System.out.println("最初の要素: " + first);
        System.out.println("最後の要素: " + last);
	}

}
