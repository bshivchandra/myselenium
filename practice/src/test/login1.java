package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login1 {
	@Test
	public void login1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiv\\eclipse-workspace2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://solutionstouch.com/");
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/ul[2]/li/a")).click();
		driver.findElement(By.xpath("//*[@id=\"loginid\"]")).sendKeys("bhusse.shiva@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"loginpass\"]")).sendKeys("shiva2007");
		driver.findElement(By.xpath("//*[@id=\"loginuser\"]")).click();
		System.out.println(driver.findElement(By.className("modal-body")).getText());
		driver.findElement(By.cssSelector("#errormodal > div > div > div.modal-footer > button")).click();

	}



}
