package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("hello world");
       
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiv\\eclipse-workspace2\\chromedriver.exe");
       WebDriver driver= new ChromeDriver();
       driver.get("https://www.google.com/");
	}

}
