import java.util.regex.*;
import java.util.ArrayList;

class UserRegistration{

	public static void main(String args[])
	{
		ArrayList<String> emails = new ArrayList<String>();

		//Valid Emails
		emails.add("abc@yahoo.com,");
		emails.add("abc-100@yahoo.com,");
		emails.add("abc.100@yahoo.com");
	   emails.add("abc111@abc.com,");
      emails.add("abc-100@abc.net,");
      emails.add("abc-100@abc.com.au");
      emails.add("abc@1.com,");
      emails.add("abc@gmail.com.com");
      emails.add("abc+100@gmail.com");

		//Invalid Emails
		emails.add("abc");
      emails.add("abc@.com.my");
      emails.add("abc123@gmail.a");
      emails.add("abc123@.com");
      emails.add("abc123@.com.com");
      emails.add(".abc@abc.com");
      emails.add("abc()*@gmail.com");
      emails.add("abc@%*.com");
      emails.add("abc..2002@gmail.com");
      emails.add("abc@gmail.com");
      emails.add("abc@abc@gmail.com");
      emails.add("abc@gmail.com.1a");
      emails.add("abc@gmail.com.aa.au");

		String regex = "^[0-9a-z+.-]+@[A-Za-z0-9.,]{2,}+$";
		Pattern pat = Pattern.compile(regex);
		for (String email : emails)
		{
			Matcher match = pat.matcher(email);
			boolean result = match.matches();
			System.out.println(email +" : "+ result);
		}
	}
}

