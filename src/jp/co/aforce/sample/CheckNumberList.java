package jp.co.aforce.sample;

public class CheckNumberList {
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(10);
//		list.add(2);
//		list.add(20);
//		
//		
//		if(list.get(0) >= 10) {
//			System.out.println("large");
//		} else {
//			System.out.println("small");
//		}
		
		int number = 15;
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        boolean isLarge = number > 10;
        
        if(isLarge) {
        	list.add("large");
        } else {
        	list.add("small");
        }
        	System.out.println(list);
	}

}
