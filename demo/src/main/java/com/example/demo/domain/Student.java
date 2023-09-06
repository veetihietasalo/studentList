package com.example.demo.domain;

public class Student {

	private String lastName;
	private String firstName;

	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Student [lastName=" + lastName + ", firstName=" + firstName + "]";
	}
	
	
	
	
}
