package verifyloginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verifylogin {
	
	    WebDriver driver;

	public Verifylogin(WebDriver driver)
	{ 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="loginid")
	WebElement username;
	
	@FindBy(id="loginpass")
	WebElement password;

	@FindBy(id="loginuser")
	WebElement loginbutton;

	
	
	public void loginIdPass(String userid, String pass) throws InterruptedException
	{
		
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/ul[2]/li/a")).click();	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
    	username.sendKeys(userid);
		password.sendKeys(pass);
		loginbutton.click();		
		System.out.println(driver.findElement(By.className("modal-body")).getText());
		Thread.sleep(1000);
		driver.findElement(By.className("close")).click();
		Thread.sleep(1000);

		driver.quit();
	}
}
