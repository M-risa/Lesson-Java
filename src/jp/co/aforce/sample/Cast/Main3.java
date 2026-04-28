package jp.co.aforce.sample.Cast;

import jp.co.aforce.sample.Cast.Cast3.Circle;
import jp.co.aforce.sample.Cast.Cast3.Shape;

public class Main3 {
	public static void main(String[] args) {
		Shape s = new Circle();
		
		if(s instanceof Circle) {
			Circle c = (Circle) s;
			c.ring();
		}
	}
	

}
