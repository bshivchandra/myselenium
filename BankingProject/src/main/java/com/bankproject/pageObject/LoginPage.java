package com.bankproject.pageObject;

import org.codehaus.plexus.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bankingproject.testCases.BaseClass;

public class LoginPage  {
    WebDriver driver;
		
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(name="uid")
	static
	WebElement username;
	
	@FindBy(name="password")
	static        
	WebElement password;
	
	@FindBy(name="btnLogin")
	static
	WebElement loginbutton;
	
	public void loginMethod(String username2,String password2) throws Exception
	{
		username.sendKeys(username2);
		//logger.info("username filled");

		password.sendKeys(password2);
		//logger.info("password filled");

		Thread.sleep(1000);

		loginbutton.click();
		Thread.sleep(1000);
		//logger.info("Welcome to gurru");

		
		
	}
	    	
}





