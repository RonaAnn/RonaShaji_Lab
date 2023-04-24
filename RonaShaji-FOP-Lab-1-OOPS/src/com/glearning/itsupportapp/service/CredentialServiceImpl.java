package com.glearning.itsupportapp.service;

import java.util.Random;
import com.glearning.itsupportapp.model.Employee;

public class CredentialServiceImpl implements CredentialService {

	private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
	private static final String NUMBER = "0123456789";
	private static final String SPECIAL_CHARS = "!@#$%^&*()_";
	private static final String PASSWORD = UPPER_CASE + LOWER_CASE + NUMBER + SPECIAL_CHARS;
	Random random = new Random();

	@Override
	public String generateEmailAddress(String firstName, String lastName, String dept, String company) {

		String email = firstName + lastName + "@" + dept + "." + company + ".com";

		return email;
	}

	@Override
	public String generatePassword(int length) {

		StringBuilder password = new StringBuilder(length);

		// lower case
		password.append(LOWER_CASE.charAt(random.nextInt(LOWER_CASE.length())));

		// upper case
		password.append(UPPER_CASE.charAt(random.nextInt(UPPER_CASE.length())));

		// number
		password.append(NUMBER.charAt(random.nextInt(NUMBER.length())));

		// special char
		password.append(SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length())));

		// filling rest with random characters
		for (int i = 4; i < length; i++) {
			password.append(PASSWORD.charAt(random.nextInt(PASSWORD.length())));
		}

		// shuffle the characters in password
		char[] passwordChar = password.toString().toCharArray();

		for (int i = 0; i < passwordChar.length; i++) {

			// get a random char index
			int j = random.nextInt(passwordChar.length);

			char temp = passwordChar[i];
			passwordChar[i] = passwordChar[j];
			passwordChar[j] = temp;
		}

		return new String(passwordChar);
	}

	@Override
	public void displayCredentials(Employee employee) {

		System.out.println("\nDear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email ---> " + employee.getEmail());
		System.out.println("Password ---> " + employee.getPassword());
	}
}
