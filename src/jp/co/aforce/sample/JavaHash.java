package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;

public class JavaHash {
	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<>();
		items.put("消しゴム", 100);
        items.put("鉛筆", 50);
        items.put("ノート", 150);
        
        System.out.println("--- 在庫一覧 ---");
        
        for(Map.Entry<String, Integer> entry : items.entrySet()) {
        	System.out.println("商品名: " + entry.getKey() + ", 価格: " + entry.getValue() + "円");
        }
        
        Map<String, Integer> scores = new HashMap<>();
        scores.put("田中", 85);
        scores.put("佐藤", 92);
        scores.put("鈴木", 78);
        
	}

}
