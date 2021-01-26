import java.util.regex.*;

class UserRegistration{

	public static void main(String args[])
	{
		Pattern pat = Pattern.compile("^[1-9]{2}\\s[0-9]{10}$");
		Matcher match = pat.matcher("91 9919819801");
		boolean result = match.matches();
		System.out.println(result);

	}

}
