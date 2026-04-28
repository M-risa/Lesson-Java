package jp.co.aforce.sample;

public class Practice6 {
	
	//問１
	public static void main(String[] args) {
		System.out.println("Hello, Would!");
		
		
	//問２
		int a = 1;
		int b = 2;
		int result = a + b;
		System.out.println(result);
		
	//問３
		if(args.length > 0) {
			System.out.println("値："+ args[0]);
		} else{
			System.out.println("引数なし");
		}
		
		
	//問４
	class Cleaner{
		void startCleaning() {
			System.out.println("空気清掃除機：掃除を開始します。");
		}
	}
			
	class AirPurifier{
		void startPurifying() {
			System.out.println("空気清浄機：空気を綺麗にします。");
		}
	}
	
	Cleaner myCleaner = new Cleaner();
	AirPurifier myPurifier = new AirPurifier();
	
	myCleaner.startCleaning();
    myPurifier.startPurifying();

    
    //問５
    String name = "Risa";
    int age = 22;
    
    System.out.println("私の名前は、" + name + "です。");
    System.out.println("年齢は、" + age + "歳です。");
			
	}

}
