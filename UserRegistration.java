import java.util.regex.*;

class UserRegistration{

	public static void main(String args[])
	{
		Pattern pat = Pattern.compile("^[a-z0-9.]+@[a-z.]+$");
		Matcher match = pat.matcher("abc.xyz@bl.co.in");
		boolean result = match.matches();
		System.out.println(result);

	}

}
