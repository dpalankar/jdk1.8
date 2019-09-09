package com.example;

public class ThreadExample extends Thread{

	@Override
	public void run() {
		System.out.println("Current thread name: " + Thread.currentThread().getName()); 
		System.out.println("Running called");
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadExample th1 = new ThreadExample();
		ThreadExample th2 = new ThreadExample();
		th1.start();
//		th2.run();
		th1.join();
		th2.start();
//		th2.run();
//		th2.start();
	}

}
