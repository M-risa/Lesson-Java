package jp.co.aforce.sample.Test;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeTest3 {
	public static void main(String[] args) {
		
		//問1
		ArrayList<String> items = new ArrayList<>();
			items.add("シャープペンシル");
			items.add("ボールペン");
			items.add("リングノート");
			items.add("クリップ");
			items.add("消しゴム");
			
		//問２
			System.out.println(items.get(1));
			
		//問３
			ArrayList<String> employees = new ArrayList<>();
			employees.add("山田太郎");
	        employees.add("鈴木花子");
	        employees.add("佐藤二郎");
	        employees.add("山田太郎");
	        employees.add("高橋三郎");
	        
	        System.out.println(employees);
	        
	     //問５
	        System.out.println(employees.get(2));
	        
	        
	     //問６
	        ArrayList<Integer> list1 = new ArrayList<>();
		        list1.add(10);
		        list1.add(15);
		        list1.add(16);
		        list1.add(19);
		        
		    ArrayList<Integer> list2 = new ArrayList<>();
			    list2.add(11);
			    list2.add(12);
			    list2.add(18);
			    list2.add(20);
			    
			list1.addAll(list2);
			
			Collections.sort(list1);
			
			for(int list : list1) {
				System.out.println(list);
			}
			
			
			//問７
			ArrayList<Integer> list3 = new ArrayList<>();
				list3.add(13);
				list3.add(14);
				list3.add(17);
				list3.add(21);
				
			Collections.sort(list1);
		    Collections.sort(list3);
		    
		    for(int list : list1) {
		    	System.out.println(list);
		    }
		    
		    for(int list : list3) {
		    System.out.println(list);
		    }
	}

}
