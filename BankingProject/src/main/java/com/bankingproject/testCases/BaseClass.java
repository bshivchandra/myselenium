package com.bankingproject.testCases;

	

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.bankproject.pageObject.LoginPage;
import com.bankproject.utility.Readconfig;

public class BaseClass {
	
	
	Readconfig read=new Readconfig();
	public String baseurl=read.getUrl();
	public String username=read.getusername();
	public String password=read.getpassword(); 	
	/*
	String baseurl="C";
	public String username="mngr331089"; 
	public String password="tEjAgyp";
*/
	
	WebDriver driver;
	public static Logger logger=Logger.getLogger(BaseClass.class);
	
	@BeforeClass
	public void setUp() throws Exception
	{
		logger.info("here logger files");
        PropertyConfigurator.configure("Log4j.properties");

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiv\\eclipse-workspace2\\chromedriver.exe");
	        driver= new ChromeDriver();
			driver.get(baseurl);
			logger.info("driver start"); 
			LoginPage login=new LoginPage(driver);
	  		login.loginMethod(username,password);
			
	 }
	@AfterClass
	public void tearDown()
	{   
		//driver.quit();
		logger.info("driver quit"); 
       
	}
	
	
	
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(10);
		return (generatedString2);
	}
	
}
