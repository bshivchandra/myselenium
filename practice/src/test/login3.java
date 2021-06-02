package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import verifyloginpage.Verifylogin;

public class login3 {
	@Test
	public void login3() throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiv\\eclipse-workspace2\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://solutionstouch.com/");
		Verifylogin login=new Verifylogin(driver);
		login.loginIdPass("bhusse@gmail.com", "shiva1234");
	}
}
