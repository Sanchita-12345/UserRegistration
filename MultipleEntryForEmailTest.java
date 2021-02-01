package com.bridgelabz;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MultipleEntryForEmailTest {
	
	public String email;
	public boolean expectedResult;
	
	public MultipleEntryForEmailTest(String email, boolean expectedResult) {
		this.email = email;
		this.expectedResult = expectedResult; 
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new object[][] {
			{"abc@yahoo.com,",true},{"abc-100@yahoo.com,",true},
			{"abc.100@yahoo.com",true},{"abc111@abc.com,",true},
			{"abc-100@abc.net,"true},{"abc.100@abc.com.au",true},
			{"abc",false},{"abc()*@gmail.com",false},
			{"abc@%.com",false}{"abc@abc@gmail.com",false}
		});
		}
	@Test
	public void testEmail() {
		try {
			MultipleEntryForEmail user = new MultipleEntryForEmail();
			boolean result = user.Email(email);
			Assert.assertEquals(expectedResult, result);
		} catch(MultipleEntryForEmailException e) {
			System.out.println("Exception : " +e.getMessage());
		}
	}
}
