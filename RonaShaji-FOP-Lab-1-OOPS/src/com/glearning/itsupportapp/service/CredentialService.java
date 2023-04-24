package com.glearning.itsupportapp.service;

import com.glearning.itsupportapp.model.Employee;

public interface CredentialService {

	String generateEmailAddress(String firstName, String lastName, String dept, String company);

	String generatePassword(int length);

	void displayCredentials(Employee employee);
}
