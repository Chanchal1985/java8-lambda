package com.java8.unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		// sample lamba example for runnable interface
		Thread tRunnableLambada = new Thread(() -> printMessage());
		tRunnableLambada.start();

		// threadRunnable with method reference
		Thread tRunnableMethodRef = new Thread(MethodReferenceExample1::printMessage);
		tRunnableMethodRef.start();

		// () -> someMethod() == SomeClass :: someMethod
	}

	public static void printMessage() {
		System.out.println("Sample Method reference Example");
	}

}
