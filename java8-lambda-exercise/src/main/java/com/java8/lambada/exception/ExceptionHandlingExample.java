package com.java8.lambada.exception;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int[] someNumbers = { 1, 2, 3, 4 };
		int key = 0;
		process(someNumbers, key, wrapLambda((v, k) -> System.out.println("Multiply : " + (v * k))));
		process(someNumbers, key, wrapLambda((v, k) -> System.out.println("Addition : " + (v + k))));
		process(someNumbers, key, wrapLambda((v, k) -> System.out.println("Subtract : " + (v - k))));
		process(someNumbers, key, wrapLambda((v, k) -> System.out.println("devide : " + (v / k))));
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : someNumbers) {
			consumer.accept(i, key);
		}
	}

	private static BiConsumer<Integer, Integer> wrapLambda(BiConsumer<Integer, Integer> consumer) {
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			} catch (ArithmeticException ex) {
				System.out.println("Execption occured in operation : " + ex.getMessage());
			}
		};
	}

}
