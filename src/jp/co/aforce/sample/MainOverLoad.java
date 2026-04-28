package jp.co.aforce.sample;

public class MainOverLoad {
	public static void main(String[] args) {
	
	//オーバーロード　問1
	Pratice7 calc = new Pratice7 ();
	
	int result2 = calc.add(10, 20);
	System.out.println("2つの整数の和: " + result2);
	
	int result3 = calc.add(10, 20, 30);
	System.out.println("3つの整数の和: " + result3);
	
	
	//問２
	Rectangle rect1 = new Rectangle(10, 20);
	System.out.print("rect1: ");
    rect1.display();
    
    Rectangle rect2 = new Rectangle(15);
    System.out.print("rect2: ");
    rect2.display();
    
    
    //問３
    Practice73 calc3 = new Practice73();
    
    int sum2 = calc3.sum(10, 20);
    System.out.println("2つの和: " + sum2);
    
    int sum5 = calc3.sum(1, 2, 3, 4, 5);
    System.out.println("5つの和: " + sum5);
    
    int sum3 = calc3.sum(23, 34, 45);
    System.out.println("3つの和: " + sum3);

	
	}

}
