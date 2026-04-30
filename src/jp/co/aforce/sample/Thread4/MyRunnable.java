package jp.co.aforce.sample.Thread4;

public class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Hello from a thread!");
	}
	
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		
		Thread thread = new Thread(myRunnable);
		thread.start();
	}
	

}
