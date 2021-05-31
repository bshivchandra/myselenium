package verifyloginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Verifylogin {
	WebDriver driver;
	By username = By.xpath("//*[@id=\"loginid\"]");
	By password = By.xpath("//*[@id=\"loginpass\"]");
	By loginbutton = By.xpath("//*[@id=\"loginuser\"]");
	
	public Verifylogin(WebDriver driver)
	{ 
		this.driver=driver;
	}
	public void loginIdPass(String userid, String pass) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/ul[2]/li/a")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
    	driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginbutton).click();		
		System.out.println(driver.findElement(By.className("modal-body")).getText());
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#errormodal>div>div>div.modal-footer > button")).click();
		Thread.sleep(1000);

		driver.quit();
	}
}
