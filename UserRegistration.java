import java.util.regex.*;

class UserRegistration{

	public static void main(String args[])
	{
		Pattern pat = Pattern.compile("^[a-z]{8,}$");
		Matcher match = pat.matcher("sanchita");
		boolean result = match.matches();
		System.out.println(result);

	}

}
