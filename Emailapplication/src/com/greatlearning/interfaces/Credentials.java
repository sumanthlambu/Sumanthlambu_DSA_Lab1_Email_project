package com.greatlearning.interfaces;

import com.greatleraning.model.Employee;

public interface Credentials {

	// generate Email
	// generate password
	
	public String GenerateEmailAdd(String FirstName, String Lastname, String Department);
	public String GeneratePassword();
	public String ShowCredentials(Employee emp);
}
