package jp.co.aforce.sample;

public class Practice6void4 {
	public static void main(String[] args) {
		String result = repeat("Java", 3);
	
		System.out.println(result);
	}
	
	public static String repeat(String word, int times) {
		String result = "";
		
		for(int i = 0; i < times; i++) {
			result = result + word;
		}
		
		return result;
	}
}
