package com.glearning.itsupportapp.model;

public class Employee {

	private String firstName, lastName, password, emailAdress;

	public Employee(String fname, String lname) {
		firstName = fname;
		lastName = lname;
	}

	public Employee(String fname, String lname, String email) {
		firstName = fname;
		lastName = lname;
		emailAdress = email;
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

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return emailAdress;
	}

	public void setEmail(String email) {
		this.emailAdress = email;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", emailAdress=" + emailAdress + "]";
	}
}
