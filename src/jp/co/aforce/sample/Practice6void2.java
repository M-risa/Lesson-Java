package jp.co.aforce.sample;

public class Practice6void2 {
	public static void main(String[] args) {
		int result = add(24, 35);
		System.out.println("合計金額は " + result + " 円です。");
		
	}
	
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

}
