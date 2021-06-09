package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	String baseurl="https://solutionstouch.com/";
//	String username="bhusse.shiva@gmail.com";
//	String password="shiva";
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiv\\eclipse-workspace2\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get(baseurl);
		System.out.println(driver.getTitle());
		System.out.println("Execute BaseClass");




	}
	@AfterClass
	public void tearEnd()
	{
		driver.quit();
	}

	
	


}
	



