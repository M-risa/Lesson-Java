package jp.co.aforce.sample;

public class Break {
	public static void main(String[] args) {
		
		//問1
		System.out.println("問1");
		
		int o = 1;
		
		while(o <= 10) {
			System.out.println(o);
			if(o == 5) {
				break;
			}
			o++;
		}
		
		
		//問2
		System.out.println("問2");
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int n : numbers) {
			System.out.println(n);
			if(n == 7) {
				break;
			}
		}
		
		//問3
		System.out.println("問3");
		
		int [][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		outer: //外側のループに「outer」という名前（ラベル）を付ける
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				
				System.out.println("調査中: [" + i + "][" + j + "] = " + matrix[i][j]);
				
				if(matrix[i][j] == 8) {
					break outer;
				}
			}
		}
		System.out.println("探索が終了しました。");
	}

}
