package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	
UserRegistrationMain uc = new UserRegistrationMain();
	
	@Test
	public void isFirstNameHappy() {
		UserRegistrationMain uc = new UserRegistrationMain();
		boolean result =uc.getFirstName("Sanchita");
		Assert.assertTrue(result);
	}
	
	@Test
	public void isFirstNameSad() {
		UserRegistrationMain uc = new UserRegistrationMain();
		boolean result =uc.getFirstName("sanchita");
		Assert.assertFalse(result);
	}
	
	@Test
	public void isLastNameHappy() {
		UserRegistrationMain uc = new UserRegistrationMain();
		boolean result =uc.getLastName("Barik");
		Assert.assertTrue(result);
	}
	
	@Test
	public void isLastNameSad() {
		UserRegistrationMain uc = new UserRegistrationMain();
		boolean result =uc.getLastName("barik");
		Assert.assertFalse(result);
	}
	
	@Test
	public void isEmailHappy() {
		UserRegistrationMain uc = new UserRegistrationMain();
		boolean result =uc.getEmail("sanchitabarik40@gmail.com");
		Assert.assertTrue(result);
	}
	@Test
	public void isEmailSad() {
		UserRegistrationMain uc = new UserRegistrationMain();
		boolean result =uc.getEmail("sanchitabarik40gmail.com");
		Assert.assertFalse(result);
	}

	@Test
    public void isMobileNumberHappy(){
		UserRegistrationMain uc = new UserRegistrationMain();
        boolean result=uc.getMobileNumber("91 9932675488");
        Assert.assertTrue(result);
    }
    @Test
    public void isMobileNumberSad(){
    	UserRegistrationMain uc = new UserRegistrationMain();
        boolean result=uc.getMobileNumber("897678764");
        Assert.assertFalse(result);
    }
    @Test
    public void isPasswordRuleOneHappy(){
    	UserRegistrationMain uc = new UserRegistrationMain();
        boolean result=uc.getPasswordRuleOne("sanchita");
        Assert.assertTrue(result);
    }
    @Test
    public void isPasswordRuleOneSad(){
    	UserRegistrationMain uc = new UserRegistrationMain();
        boolean result=uc.getPasswordRuleOne("abc");
        Assert.assertFalse(result);
    }
    @Test
    public void isPasswordRuleTwoHappy(){
    	UserRegistrationMain uc = new UserRegistrationMain();
        boolean result=uc.getPasswordRuleTwo("Sanchita");
        Assert.assertTrue(result);
    }
    @Test
    public void isPasswordRuleTwoSad(){
    	UserRegistrationMain uc = new UserRegistrationMain();
        boolean result=uc.getPasswordRuleTwo("sanchita");
        Assert.assertFalse(result);
    }
    @Test
    public void isPasswordRuleThreeHappy(){
    	UserRegistrationMain uc = new UserRegistrationMain();
        boolean result =uc.getPasswordRuleThree("Sanchita9876");
        Assert.assertTrue(result);
    }
    @Test
    public void ispasswordRuleThreeSad(){
    	UserRegistrationMain uc = new UserRegistrationMain();
        boolean result=uc.getPasswordRuleThree("Sanchita");
        Assert.assertFalse(result);
    }
    @Test
    public void isPasswordRuleFourHappy(){
    	UserRegistrationMain uc = new UserRegistrationMain();
        boolean result=uc.getPasswordRuleFour("Sanchita#9876");
        Assert.assertTrue(result);
    }
    @Test
    public void isPasswordRuleFourSad(){
    	UserRegistrationMain uc = new UserRegistrationMain();
        boolean result=uc.getPasswordRuleFour("sanchita7654");
        Assert.assertFalse(result);
    }
}
