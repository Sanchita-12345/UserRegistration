package com.bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterFace
interface UserRegistrationDetails {
	boolean check(String s);
}

public class UserRegistrationMain {
   	private static final String firstName = "^[A-Z]{1}[a-z]{2,}$";
   	private static final String lastName = "(^[A-Z]{1}[a-z]{2,})+\\s+([A-Z]{1}[a-z]{2,})*$";
   	private static final String email = "^[a-z0-9.]+@[a-z.]+$";
   	private static final String phoneNumber = "^[1-9]{2}\\s[0-9]{10}$";
   	private static final String passwordOne = "^[a-z]{8,}$";
   	private static final String passwordTwo = "^(?=.*[A-Z])(?=.*[a-z]).{8,}$";
   	private static final String passwordThree = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$";
   	private static final String passwordFour = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}$";
	
   	//using Lambda Function
   	UserRegistrationDetails getFirstName = (s) -> (Pattern.compile(firstName).matcher(s).matches());
   	UserRegistrationDetails getLastName = (s) -> (Pattern.compile(lastName).matcher(s).matches());
   	UserRegistrationDetails getEmail = (s) -> (Pattern.compile(email).matcher(s).matches());
   	UserRegistrationDetails getMobileNumber = (s) -> (Pattern.compile(phoneNumber).matcher(s).matches());
   	UserRegistrationDetails getPasswordRuleOne = (s) -> (Pattern.compile(passwordOne).matcher(s).matches());
   	UserRegistrationDetails getPasswordRuleTwo = (s) -> (Pattern.compile(passwordTwo).matcher(s).matches());
   	UserRegistrationDetails getPasswordRuleThree = (s) -> (Pattern.compile(passwordThree).matcher(s).matches());
   	UserRegistrationDetails getPasswordRuleFour = (s) -> (Pattern.compile(passwordFour).matcher(s).matches());
}
