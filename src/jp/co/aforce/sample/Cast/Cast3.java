package jp.co.aforce.sample.Cast;

public class Cast3 {
	 public  static interface Shape{
		void showArea();
	}

	
	 public static class Circle implements Shape{
		@Override
		public void showArea() {
			System.out.println("丸の面積を表示します。");
		}
		
		void ring() {
			System.out.println("円を描きます。");
			}
	}
	
	 public static class Rectangle implements Shape{
		@Override
		public void showArea() {
			System.out.println("四角の面積を表示します。");
		}
	}

}


