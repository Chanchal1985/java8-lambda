package com.java8.lambada;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Exercise {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Deckons", 30), new Person("Lewis", "Corroll", 42),
				new Person("Thomas", "Carlyle", 42), new Person("Chalotte", "Brante", 42),
				new Person("Mathiew", "Arnold", 42));

		// Step 1.a : Sort List by last name
		Collections.sort(people, (a, b) -> a.getLastName().compareTo(b.getLastName()));
		performConditionally(people, p -> true, p -> System.out.println(p));
		System.out.println("------------------------------------");

		// Step 1.b : Sort List by first name
		Collections.sort(people, (a, b) -> a.getFirstName().compareTo(b.getFirstName()));
		performConditionally(people, p -> true, p -> System.out.println(p));
		System.out.println("------------------------------------");

		// step 2 : print all elements in list
		performConditionally(people, p -> true, p -> System.out.println(p));
		System.out.println("------------------------------------");

		// step 3 : print elements in starting last name with 'c'
		performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
		System.out.println("------------------------------------");
	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> behaviour) {
		for (Person person : people) {
			if (predicate.test(person))
				behaviour.accept(person);
		}
	}
}
