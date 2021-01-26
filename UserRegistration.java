import java.util.regex.*;

class UserRegistration{

	public static void main(String args[])
	{
		Pattern pat = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher match = pat.matcher("Sanchita");
		boolean result = match.matches();
		System.out.println(result);

	}

}
