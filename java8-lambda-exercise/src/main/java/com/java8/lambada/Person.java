package com.java8.lambada;

public class Person {

	private String firstName;

	private String lastName;

	private int age;

	public Person(String firstName, String laststName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = laststName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String laststName) {
		this.lastName = laststName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", laststName=" + lastName + ", age=" + age + "]";
	}
}
