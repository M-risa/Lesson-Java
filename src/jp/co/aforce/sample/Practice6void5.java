package jp.co.aforce.sample;

public class Practice6void5 {
	public static void main(String[] args) {
		double area = calcArea(3.0);
		System.out.println("面積は: " + area);
	}
	
	public static double calcArea(double r) {
		//計算
		double result = r * r * Math.PI;
		
		return result;
	}

}
