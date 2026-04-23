package jp.co.aforce.sample;

import java.util.Scanner;

public class JavaQ {
	public static void main(String[] args) {
	
	//問1
	int num = 10;
	System.out.println(num);
	
	//問2
	int a = 8;
	int b = 5;
	int sum  = a + b;
	System.out.println(sum);
	
	//問3
	int width = 7;
	int height = 4;
	int area = width * height;
	System.out.println(area);
	
	//問4
	String name = "Java";
	double version = 17.0;
	boolean isFun = true;
	
	
	//問5
	System.out.println(name);
	System.out.println(version);
	System.out.println(isFun);
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("名前を入力してください:");
		
	String inputName = scanner.nextLine();
	System.out.println("こんにちは、" + inputName + "さん！");
	
	scanner.close();

	
	//問6
	String names = "村石";
    int age = 22;
    String birthday = "2003-11-19";
    
    String message = String.format("名前： %s, 年齢： %d歳, 誕生日： %s", names, age, birthday);
    
    System.out.println(message);
    
    
    //問7    
    System.out.print("商品の名前を入力してください： ");
    String itemName =  scanner.nextLine();
    
    System.out.print("単価（価格）を入力してください: ");
    int price = scanner.nextInt();
    
    System.out.print("購入個数を入力してください: ");
    int quantity = scanner.nextInt();
    
    int totalPrice = price * quantity;
    
    String result = String.format(
    		"商品名: %s ／ 単価: %d円 ／ 個数: %d個 ／ 合計金額: %d円",
    		itemName, price, quantity, totalPrice);
    
    System.out.println("--- 計算結果 ---");
    System.out.println(result);

    scanner.close();

	}
	
}


