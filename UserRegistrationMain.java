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
	
	public boolean  getFirstName(String first_name) {
		Pattern pattern = Pattern.compile(firstName);
		return pattern.matcher(first_name).matches();
	}

	public boolean  getLastName(String last_name) {
		Pattern patten = Pattern.compile(lastName);
		return pattern.matcher(last_name).matches();
	}
	
	
	public boolean  getEmail(String emailId) {
		Pattern pattern = Pattern.compile(email);
		return pattern.matcher(emailId).matches();
	}
	
	public boolean  getMobileNumber(String ph_no) {
		Pattern pattern = Pattern.compile(phoneNumber);
		return pattern.matcher(ph_no).matches();
	}
	
	public boolean  getPasswordRuleOne(String password_one) {
		Pattern pattern = Pattern.compile(passwordOne);
		return pattern.matcher(password_one).matches();
	}
	
	public boolean  getPasswordRuleTwo(String password_two) {
		Pattern pattern = Pattern.compile(passwordTwo);
		return pattern.matcher(password_two).matches();
	}
	
	public boolean  getPasswordRuleThree(String password_three) {
		Pattern pattern = Pattern.compile(passwordThree);
		return pattern.matcher(password_three).matches();
	}
	
	public boolean  getPasswordRuleThree(String password_four) {
		Pattern pattern = Pattern.compile(passwordFour);
		return pattern.matcher(password_four).matches();
	}
}
