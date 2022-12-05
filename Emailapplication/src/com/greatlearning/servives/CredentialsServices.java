package com.greatlearning.servives;

import java.util.Random;

import com.greatlearning.interfaces.Credentials;
import com.greatleraning.model.Employee;


public class CredentialsServices implements Credentials  {


	@Override
	public String GenerateEmailAdd(String FirstName, String LastName, String Department) {
		String Email = "Email: "+FirstName+LastName+"@"+Department+".GreatLearning.com";
		return Email;
	}

	@Override
	public String GeneratePassword() {
		
        String Capital_words = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_words = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";
        
        String Pass_text = Capital_words + Small_words +
                numbers + symbols;
        
        // Generate pass by random method
        
        Random pass_obj = new Random();
        
        String password=""; 
        		
        		for (int i=1; i<8;i++)
        		{
        			int boundvalue = Pass_text.length();
        			int randomIndex=pass_obj.nextInt(boundvalue);
        			char randomchar=Pass_text.charAt(randomIndex);
        			password += String.valueOf(randomchar);
        		
        		}
        return password;
	}

	@Override
	public String ShowCredentials(Employee emp) {
		// TODO Auto-generated method stub
		
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are :");
		System.out.println(emp.getEmail());
		System.out.println("Passwwwor: "+emp.getPassword());
		
		return null;
	}

	
	

}

