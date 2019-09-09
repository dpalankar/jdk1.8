package com.example;

public class RunThreadExample implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Current thread name: " + Thread.currentThread().getName()); 
	}

	public static void main(String[] args) {
		Thread th1 = new Thread(new RunThreadExample());
		th1.start();
		Thread th2 = new Thread(new RunThreadExample());
		th2.start();
	}
}
