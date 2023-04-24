package com.glearning.itsupportapp.client;

import java.util.Scanner;
import com.glearning.itsupportapp.model.Employee;
import com.glearning.itsupportapp.service.CredentialServiceImpl;

public class Client {

	public static void main(String[] args) {
		String firstName = "Lucinda";
		String lastName = "Gregory";
		Employee employee = new Employee(firstName, lastName);
		CredentialServiceImpl service = new CredentialServiceImpl();

		System.out.println("Please enter the department form the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resourse");
		System.out.println("4. Legal");

		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		sc.close();
		String generatedEmail, generatedPassword;

		switch (option) {
		case 1: {
			generatedEmail = service.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "tech", "abc");
			generatedPassword = service.generatePassword(12);

			employee.setEmail(generatedEmail);
			employee.setPassword(generatedPassword);

			service.displayCredentials(employee);
			break;
		}
		case 2: {
			generatedEmail = service.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "adm", "abc");
			generatedPassword = service.generatePassword(12);

			employee.setEmail(generatedEmail);
			employee.setPassword(generatedPassword);

			service.displayCredentials(employee);
			break;
		}
		case 3: {
			generatedEmail = service.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "hr", "abc");
			generatedPassword = service.generatePassword(12);

			employee.setEmail(generatedEmail);
			employee.setPassword(generatedPassword);

			service.displayCredentials(employee);
			break;
		}
		case 4: {
			generatedEmail = service.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "legal", "abc");
			generatedPassword = service.generatePassword(12);

			employee.setEmail(generatedEmail);
			employee.setPassword(generatedPassword);

			service.displayCredentials(employee);
			break;
		}
		default: {
			System.out.println("Enter a valid option.");
		}
		}
	}
}
