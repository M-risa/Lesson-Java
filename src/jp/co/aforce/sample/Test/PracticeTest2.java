package jp.co.aforce.sample.Test;

public class PracticeTest2 {
	public static void main(String[] args) {
		
	//問１
	double TAX = 0.1;
	System.out.println(TAX);
	
	//問2
	int x  = 480;
	double price = x * (1 + TAX);
	System.out.println("税込み " + price);
	
	//問3
	String name = "Risa";
	System.out.println(name);
	
	//問４
	String object  = "この商品の値段は";
	String yen = "円です";
	System.out.println(object + price + yen);
	}

}
