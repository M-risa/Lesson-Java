package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;

public class Fruit {
	public static void main(String[] args) {
	    Map<String, Integer> fruitMap = new HashMap<>();
	    fruitMap.put("りんご", 100);
	    fruitMap.put("みかん", 80);
	    fruitMap.put("バナナ", 120);
	    fruitMap.put("いちご", 300);
	    
	    String targetFruit = "みかん";
	    
	    if(fruitMap.containsKey(targetFruit)) {
	    	int price = fruitMap.get(targetFruit);
	    	System.out.println(targetFruit + "の値段は" + price + "円です。");
	    } else {
	        System.out.println("申し訳ありませんが、その商品は取り扱っておりません。");
	    }
	    
		}
	}
