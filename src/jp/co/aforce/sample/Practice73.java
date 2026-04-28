package jp.co.aforce.sample;

public class Practice73 {
	int sum;
	
	public int sum(int... numbers) {
		int total = 0;
		
		for(int num : numbers) {
			total += num;
		}
		
		return total;
	}

}
