package com.java8.lambada;

public class RunnableExample {

	public static void main(String[] args) {
		Thread threadLambda = new Thread(() -> System.out.println("Inside threadLambda Method"));
		threadLambda.start();

		Thread threadRunnable = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside threadRunnable Method");

			}
		});
		threadRunnable.start();
	}

}
