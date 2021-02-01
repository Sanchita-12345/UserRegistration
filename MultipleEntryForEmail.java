package com.bridgelabz;
import java.util.regex.Pattern;

public class MultipleEntryForEmail {
	
	String emailPattern = "^[0-9a-z+.-]+@[A-Za-z0-9.,]{2,}+$";
	public boolean getEmail(String email) {
		Pattern pattern = Pattern.compile(emailPattern);
		boolean display = pattern(email).matches();
		return display;
	}
}
