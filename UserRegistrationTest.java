package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	
UserRegistrationMain uc = new UserRegistrationMain();
	
	@Test
	public void isFirstNameValid() {
		UserRegistrationMain uc = new UserRegistrationMain();
		boolean result = true;
		result = uc.getFirstName.check("Sanchita");
		Assert.assertTrue(result);
	}
	
	@Test
	public void isFirstNameInvalid() {
		UserRegistrationMain uc = new UserRegistrationMain();
		boolean result = false;
		result = uc.getFirstName.check("sanchita");
		Assert.assertFalse(result);
	}
	
	@Test
	public void isLastNameValid() {
		UserRegistrationMain uc = new UserRegistrationMain();
		boolean result = true;
		result = uc.getLastName.check("Barik");
		Assert.assertTrue(result);
	}
	
	@Test
	public void isLastNameInvalid() {
		UserRegistrationMain uc = new UserRegistrationMain();
		boolean result = false;
		result = uc.getLastName.check("barik");
		Assert.assertFalse(result);
	}
	
	@Test
	public void isEmailValid() {
		UserRegistrationMain uc = new UserRegistrationMain();
		boolean result = true;
		result = uc.getEmail.check("sanchitabarik40@gmail.com");
		Assert.assertTrue(result);
	}
	@Test
	public void isEmailInvalid() {
		UserRegistrationMain uc = new UserRegistrationMain();
		boolean result = false;
		result = uc.getEmail.check("sanchitabarik40gmailcom");
		Assert.assertFalse(result);
	}

	@Test
    public void isMobileNumberValid(){
		UserRegistrationMain uc = new UserRegistrationMain();
        boolean result = true;
        result = uc.getMobileNumber.check("91 9932675488");
        Assert.assertTrue(result);
    }
    @Test
    public void isMobileNumberInvalid(){
    	UserRegistrationMain uc = new UserRegistrationMain();
        boolean result = false; 
        result = uc.getMobileNumber.check("897678764");
        Assert.assertFalse(result);
    }
    @Test
    public void isPasswordRuleOneValid(){
    	UserRegistrationMain uc = new UserRegistrationMain();
        boolean result = true;
        result = uc.getPasswordRuleOne.check("sanchita");
        Assert.assertTrue(result);
    }
    @Test
    public void isPasswordRuleOneInvalid(){
    	UserRegistrationMain uc = new UserRegistrationMain();
        boolean result = false;
        result = uc.getPasswordRuleOne.check("abc");
        Assert.assertFalse(result);
    }
    @Test
    public void isPasswordRuleTwoValid(){
    	UserRegistrationMain uc = new UserRegistrationMain();
        boolean result = true;
        result = uc.getPasswordRuleTwo.check("Sanchita");
        Assert.assertTrue(result);
    }
    @Test
    public void isPasswordRuleTwoInvalid(){
    	UserRegistrationMain uc = new UserRegistrationMain();
        boolean result = false;
        result = uc.getPasswordRuleTwo.check("sanchita");
        Assert.assertFalse(result);
    }
    @Test
    public void isPasswordRuleThreeValid(){
    	UserRegistrationMain uc = new UserRegistrationMain();
        boolean result = true;
        result = uc.getPasswordRuleThree.check("Sanchita9876");
        Assert.assertTrue(result);
    }
    @Test
    public void ispasswordRuleThreeInvalid(){
    	UserRegistrationMain uc = new UserRegistrationMain();
        boolean result = false;
        result = uc.getPasswordRuleThree.check("Sanchita");
        Assert.assertFalse(result);
    }
    @Test
    public void isPasswordRuleFourValid(){
    	UserRegistrationMain uc = new UserRegistrationMain();
        boolean result = true;
        result = uc.getPasswordRuleFour.check("Sanchita#9876");
        Assert.assertTrue(result);
    }
    @Test
    public void isPasswordRuleFourInvalid(){
    	UserRegistrationMain uc = new UserRegistrationMain();
        boolean result = false;
        result = uc.getPasswordRuleFour.check("sanchita7654");
        Assert.assertFalse(result);
    }
}
