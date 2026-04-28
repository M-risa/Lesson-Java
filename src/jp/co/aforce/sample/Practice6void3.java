package jp.co.aforce.sample;

public class Practice6void3 {
	public static void main(String[] args) {
		int x = 55;
	
	boolean result = isEven(x);
	
	if(result) {
		System.out.println(x + " は偶数です。");
    } else {
        System.out.println(x + " は奇数です。");
    }
	
	}



	public static boolean isEven(int x) {
		if(x % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
