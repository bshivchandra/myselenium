package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import verifyloginpage.Verifylogin;

public class login3 extends BaseClass {
	@Test
	public void login3() throws InterruptedException  
	{
		Verifylogin login=new Verifylogin(driver);
		login.loginIdPass("bhusse@gmail.com", "shiva1234");
	}
}
