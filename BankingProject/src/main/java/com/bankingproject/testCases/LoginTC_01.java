package com.bankingproject.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bankproject.pageObject.LoginPage;
import com.bankproject.utility.Readconfig;

public class LoginTC_01 extends BaseClass {	
	
	@Test 
	public void loginTest() throws Exception
	{
        LoginPage login=new LoginPage(driver);
  		login.loginMethod(username,password);
		logger.info("login credentials filled");
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	      {
			logger.info("title match");
	    	  Assert.assertTrue(true);
	      }
	      else
	      {
				logger.info("title not match");
	    	  Assert.assertTrue(false);
	      }

		
	}

}

	
