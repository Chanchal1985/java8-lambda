import java.util.Arrays;
import java.util.List;

import com.java8.lambada.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Deckons", 30), new Person("Lewis", "Corroll", 42),
				new Person("Thomas", "Carlyle", 54), new Person("Chalotte", "Brante", 42),
				new Person("Mathiew", "Arnold", 63));

		System.out.println("Using legacy for loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}

		System.out.println("Using for each loop");
		for (Person person : people) {
			System.out.println(person);
		}

		System.out.println("internal foreach loop");
		people.forEach(System.out::println);

	}

}
