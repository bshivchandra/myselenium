package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import verifyloginpage.Verifylogin;

public class login2 extends BaseClass {
	@Test
	public void login2() throws InterruptedException  
	{
		Verifylogin login=new Verifylogin(driver);
		login.loginIdPass("bhusse.shiva@gmail.com", "1234");	
	}
}
