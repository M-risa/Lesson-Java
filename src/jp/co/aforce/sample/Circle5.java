package jp.co.aforce.sample;

public class Circle5 {
	double radius;
	
	public Circle5(double radius) {
		this.radius = radius;
	}
	
	String showArea() {
		double area = Math.PI * Math.pow(this.radius, 2);
		
		return "半径 " + this.radius + " の円の面積は " + area + " です。";
	}
}
