package com.java8.unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java8.lambada.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		// sample lamba example for runnable interface
		List<Person> people = Arrays.asList(new Person("Charles", "Deckons", 30), new Person("Lewis", "Corroll", 42),
				new Person("Thomas", "Carlyle", 54), new Person("Chalotte", "Brante", 42),
				new Person("Mathiew", "Arnold", 63));

		// Step 1.a : Sort List by last name
		Collections.sort(people, (a, b) -> a.getLastName().compareTo(b.getLastName()));
		performConditionally(people, p -> true, System.out::println);
		// System.out::println == p -> System.out.println(p)
		// for non static objects we need to access method by object reference

	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> behaviour) {
		for (Person person : people) {
			if (predicate.test(person))
				behaviour.accept(person);
		}
	}

}
