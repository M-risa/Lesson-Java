package jp.co.aforce.sample;

public class JavaQ25 {
	public static void main(String[] args) {
		double num = 7.8;
		int integerPart = (int) num;
		double decimalPart = num - integerPart;
		
		System.out.println("元の値: " + num);
        System.out.println("整数部分: " + integerPart);
        System.out.println("小数部分: " + decimalPart);
	} 

}
