package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistrationMain {

   	private static final String firstName = "^[A-Z]{1}[a-z]{2,}$";
   	private static final String lastName = "(^[A-Z]{1}[a-z]{2,})+\\s+([A-Z]{1}[a-z]{2,})*$";
   	private static final String email = "^[a-z0-9.]+@[a-z.]+$";
   	private static final String phoneNumber = "^[1-9]{2}\\s[0-9]{10}$";
   	private static final String passwordOne = "^[a-z]{8,}$";
   	private static final String passwordTwo = "^(?=.*[A-Z])(?=.*[a-z]).{8,}$";
   	private static final String passwordThree = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$";
   	private static final String passwordFour = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}$";
	
	public boolean getFirstName() throws InvalidUserDetailsException {
		try {
			Pattern pattern = Pattern.compile(firstName);
			return pattern.matcher("sanchita").matches();
		} catch(InvalidDException e) {
			throw new InvalidUserDetailsException("Invalid input");
		}
	}

	public boolean getLastName() throws InvalidUserDetailsException {
		try {
			Pattern pattern = Pattern.compile(lastName);
			return pattern.matcher("barik").matches();
		} catch(InvalidDException e) {
			throw new InvalidUserDetailsException("Invalid input");
		}
	}
	
	
	public boolean getEmail() throws InvalidUserDetailsException {
		try {
			Pattern pattern = Pattern.compile(email);
			return pattern.matcher("sanchitabarik@40@gmail.com").matches();
		}catch(InvalidDException e) {
			throw new InvalidUserDetailsException("Invalid input");
		}
	}
	
	public boolean getMobileNumber() throws InvalidUserDetailsException {
		try {
			Pattern pattern = Pattern.compile(phoneNumber);
			return pattern.matcher("7844391").matches();
		}catch(InvalidDException e) {
			throw new InvalidUserDetailsException("Invalid input");
		}
	}
	
	public boolean getPasswordRuleOne() throws InvalidUserDetailsException {
		try {
			Pattern pattern = Pattern.compile(passwordOne);
			return pattern.matcher("san").matches();
		}catch(InvalidException e) {
			throw new InvalidUserDetailsException("Invalid input");
		}
	}
	
	public boolean getPasswordRuleTwo() throws InvalidUserDetailsException {
		try {
			Pattern pattern = Pattern.compile(passwordTwo);
			return pattern.matcher("sanchi").matches();
		}catch(InvalidDException e) {
			throw new InvalidUserDetailsException("Invalid input");
		}
	}
	
	public boolean getPasswordRuleThree() throws InvalidUserDetailsException {
			try {
				Pattern pattern = Pattern.compile(passwordThree);
				return pattern.matcher("sanchita").matches();
			}catch(InvalidException e) {
				throw new InvalidUserDetailsException("Invalid input");
		}
	}
	
	public boolean getPasswordRuleFour() throws InvalidUserDetailsException {
		try {
			Pattern pattern = Pattern.compile(passwordFour);
			return pattern.matcher("sanchita9876").matches();
		}catch(InvalidException e) {
			throw new InvalidUserDetailsException("Invalid input");
		}
	}
}
