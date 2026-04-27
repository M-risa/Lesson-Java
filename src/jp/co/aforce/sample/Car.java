package jp.co.aforce.sample;

public class Car {
	String model;
	String color;
	
	public Car() {
		this.model = "車種不明";
		this.color = "設定なし";
	}
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void display() {
		System.out.println("モデル: " + model + ", 色: " + color);
	}

}
