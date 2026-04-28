package jp.co.aforce.sample;

import com.example.utils.MathUtils;

public class MathUtilsMain {
	public static void main(String[] args) {
		MathUtils calc = new MathUtils();
		
		int result = calc.add(10, 2);
		System.out.println("計算結果: " + result);
	}

}
