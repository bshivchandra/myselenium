package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import verifyloginpage.Verifylogin;

public class login1 {
	@Test
	public void login1() throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiv\\eclipse-workspace2\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://solutionstouch.com/");
		Verifylogin login=new Verifylogin(driver);
		login.loginIdPass("bhusse.shiva@gmail.com", "shiva");
			
	}
}
