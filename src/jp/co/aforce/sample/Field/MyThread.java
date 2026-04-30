package jp.co.aforce.sample.Field;

public class MyThread extends Thread{
    public void run() {					
        System.out.println("Hello from MyThread");					
    }					
					
    public static void main(String[] args) {					
        MyThread t = new MyThread();					
        t.start();					
        System.out.println("Hello from main");					
    }					


}
