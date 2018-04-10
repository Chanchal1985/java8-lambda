package com.java8.lambada;

public class LambadaExamples {

	public static void main(String[] args) {

		GreetingService greetingService = (message) -> System.out.println(message);
		GreetingService greetingService1 = (message) -> System.out.println("Hello " + message);
		GreetingService greetingService2 = (message) -> System.out.println("Bye " + message + " See you soon");

		greetingService.greet("Chanchal"); 
		greetingService1.greet("Chanchal");
		greetingService2.greet("Chanchal");

		/* Math Operations */

		MathOperation addition = (a, b) -> a + b;
		MathOperation substration = (a, b) -> a - b;
		MathOperation multiply = (a, b) -> a * b;
		MathOperation devide = (a, b) -> a / b;
		MathOperation mod = (a, b) -> a % b;

		System.out.println(addition.perform(4, 2));
		System.out.println(substration.perform(4, 2));
		System.out.println(multiply.perform(4, 2));
		System.out.println(devide.perform(4, 2));
		System.out.println(mod.perform(4, 2));

	}

}
