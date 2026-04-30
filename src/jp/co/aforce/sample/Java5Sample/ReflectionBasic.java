package jp.co.aforce.sample.Java5Sample;

public class ReflectionBasic {
	public static void main(String[] args) {
		String str = "Hello Java";
		
		Class<?> clazz = str.getClass();
		
		System.out.println("完全修飾名: " + clazz.getName());
		
	}

}
