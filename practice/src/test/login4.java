package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import verifyloginpage.Verifylogin;

public class login4 extends BaseClass {
	
	@Test
	public void login4() throws InterruptedException 
	{
		Verifylogin login=new Verifylogin(driver);
		login.loginIdPass("shiva@gmail.com", " ");		
	}
}
