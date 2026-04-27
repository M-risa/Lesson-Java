package jp.co.aforce.sample;

public class Book {
	String title;
	String author;
	int price;
	
	public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        }
	
	public Book(String title, String author) {
		this(title, author, 1000);
	}
	
	public void displayInfo() {
		System.out.println("タイトル: " + title + ", 著者: " + author + ", 価格: " + price + "円");
	}
}
