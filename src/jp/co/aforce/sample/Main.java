package jp.co.aforce.sample;

public class Main {
	public static void main(String[] args) { 
		
		Taiyaki taiyaki1 = new Taiyaki();
		Taiyaki taiyaki2 = new Taiyaki();
		
		taiyaki1.setFilling ("クリーム");
		taiyaki2.setFilling ("あんこ");
		
		taiyaki1.showFilling();
		taiyaki2.showFilling();
	
	}

}
