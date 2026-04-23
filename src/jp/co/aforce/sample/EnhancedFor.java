package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class EnhancedFor {
	public static void main(String[] args) {
		
		//問１
		int[] number1 = {0, 10, 20, 30, 40, 50};
		
		for(int n : number1) {
			System.out.println(n);
		}
		
		
		//問2
        List<String> fruits = new ArrayList<>();
        fruits.add("林檎");
        fruits.add("苺");
        fruits.add("蜜柑");
        
        for(String fruit : fruits) {
        	System.out.println(fruit);
        }
        
        
        //問3
        int[] number = {0, 10, 20, 30, 40, 50};
		int total = 0;
		
		for(int n : number) {
			total += n;
		}
		System.out.println(total);
		
		
		//問4
        int[] numbers = {1, 2, 3, 4, 5};
        
        for(int u : numbers) {
            System.out.println(u);
        }
        
        
        //問5
        int[] numbers1 = {1, 2, 3, 4, 5};
        int sum = 0;
        
        for(int m : numbers1) {
        	sum += m;
        }
        System.out.println("合計: " + sum);
        
        
        //問6
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        for(String name : names) {
        	System.out.println(name);
        }



	}

}
