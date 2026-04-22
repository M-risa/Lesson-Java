package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			System.out.println("初期リスト: " + list);
			
			System.out.println("2番目の要素: " + list.get(1));
			
			list.remove(Integer.valueOf(4));
			list.remove(Integer.valueOf(2));
			

	        list.add(2);
	        list.add(5);
	        list.add(6);
	        
	        System.out.println("追加・削除後: " + list);
	        
	        list.set(2, 4);
	        System.out.println("置き換え後: " + list);
	        
	        list.clear();
	        System.out.println("全削除後: " + list);
	        
	        
	        

	        

	}

}
