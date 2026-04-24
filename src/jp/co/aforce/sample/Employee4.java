package jp.co.aforce.sample;

public class Employee4 {
	int id;
	String name;
	double pay;
	
	public Employee4(int id, String name, double pay) {
		this.id = id;
		this.name = name;
		this.pay = pay;
	}
	
	String raisePay(double percent) {
		this.pay =this.pay * (1 + percent / 100);
		
		return "昇給完了！現在の給与: " + (int)this.pay + "円";
	}

}
