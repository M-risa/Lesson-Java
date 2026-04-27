package jp.co.aforce.sample.Test;


public class PracticeTest5 {
	public static void main(String[] args) {
		
		//問１
		java.util.Random rand = new java.util.Random();
		
		int fortune = rand.nextInt(4) + 1;
		
		switch(fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		
		default:
			System.out.println("凶です");
			break;
		}
		
		
		//問２
		
		
	}

}
