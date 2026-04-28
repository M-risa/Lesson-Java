package jp.co.aforce.sample;

public class Rectangle {
	int width;
	int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;	
	}
	
	public Rectangle(int width) {
		this(width, width);
	}
	
	public void display() {
        System.out.println("幅: " + width + ", 高さ: " + height);

	}
}
