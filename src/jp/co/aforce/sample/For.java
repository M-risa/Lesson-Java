package jp.co.aforce.sample;

public class For {
	public static void main(String[] args) {
		
		//問１
		for(int o = 0; o <= 10; o++) {
		System.out.println(o);
		}
		
		//問2
		int sum = 0;
		
		for(int t = 1; t <= 100; t++) {
			sum += t;
		}
		System.out.println(sum);
		
		//問３
		int n1 = 0;
		int n2 = 1;
		
		System.out.println("フィボナッチ数列の最初の10項:");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(n1 + " ");
			
			int next = n1 + n2;
			n1 = n2;
			n2 = next;
		}
	
	}

}
