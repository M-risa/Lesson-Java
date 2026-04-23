package jp.co.aforce.sample;

public class IfPractice5 {
	public static void main(String[] args) {
		int i = 0;
		while(i < 3) {
			System.out.println(i);
			i++;
		}
	
		int I = 0;
		do {
			System.out.println(I);
			I++;
		}while(I < 3);
		
		
		for(int t = 0; t < 3; t++) {
			System.out.println(t);
		}
		
		
		int[] numbers = {0, 1, 2};
		for (int n : numbers) {
			System.out.println(n);
		}
		
		
		for(int T = 0;T < numbers.length; T++) {
			System.out.println(T);
		}
		
		for(int m : numbers) {
			System.out.println(m);
		}

		
		
		for(int M = 0; M < 5; M++) {
			if(M == 3) {
				break;
			}
			System.out.println(M);
		}
		
	}


}
