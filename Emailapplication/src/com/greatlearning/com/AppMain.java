package com.greatlearning.com;

import java.util.Scanner;

import com.greatlearning.interfaces.*;
import com.greatlearning.servives.CredentialsServices;
import com.greatleraning.model.Employee;

public class AppMain {

	public static void main(String args[])
	{
		Employee obj = new Employee("Sumanth","Lambu");
		Credentials crd_Serv = new CredentialsServices();
		
		// user input
		
		System.out.println("Please chosse the Department");
		System.out.println("1. Technical");
		System.out.println("2. admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner input = new Scanner(System.in);
		int option=input.nextInt();
		
		String GeneratedEmail = null;
		String GeneratedPass = null;
		
	
		if  (option == 1) // Technical 
		{
			GeneratedEmail=crd_Serv.GenerateEmailAdd(obj.getFirstName() ,obj.getLastName(),"Tec");
			GeneratedPass=crd_Serv.GeneratePassword();
		}
		
		else if(option == 2)
		{
			GeneratedEmail=crd_Serv.GenerateEmailAdd(obj.getFirstName() ,obj.getLastName(),"Adm");
			GeneratedPass=crd_Serv.GeneratePassword();
		}
		else if(option == 3)
		{
			GeneratedEmail=crd_Serv.GenerateEmailAdd(obj.getFirstName() ,obj.getLastName(),"Hr");
			GeneratedPass=crd_Serv.GeneratePassword();
		}	
		else if(option == 4)
		{
			GeneratedEmail=crd_Serv.GenerateEmailAdd(obj.getFirstName() ,obj.getLastName(),"Lgl");
			GeneratedPass=crd_Serv.GeneratePassword();
		}
		else
		{
			System.out.println("Please Enter the valid input");
		}
		
		
		 if (option <=4)
		   {		
				obj.setEmail(GeneratedEmail);
				obj.setPassword(GeneratedPass);
				crd_Serv.ShowCredentials(obj);
				
		    }		
	}
	
	
}
