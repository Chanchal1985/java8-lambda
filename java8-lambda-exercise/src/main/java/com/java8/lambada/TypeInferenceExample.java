package com.java8.lambada;

public class TypeInferenceExample {

	public static void main(String[] args) {

		StringLengthLambda lengthLambda = (s) -> s.length();
		System.out.println(lengthLambda.getLength("Chanchal Nerkar"));

	}

	interface StringLengthLambda {
		int getLength(String str);
	}

}
