package jp.co.aforce.sample;

public class Main4 {
	public static void main(String[]arge) {
		Employee4 emp = new Employee4(110, "山岸", 200000);
//		emp.id = 110;
//		emp.name = "山岸";
//		emp.pay = 200000;
		
		String message = emp.raisePay(10.0);
		System.out.println(message);
	}

}
