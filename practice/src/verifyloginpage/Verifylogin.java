package verifyloginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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

	//@FindBy(partialLinkText="Sign")
	//WebElement signup;
	
	@FindBy(className="modal-body")
	WebElement wronglogin;
	
    @FindBy(className="close")
    WebElement ok;

	
	
	public void loginIdPass(String userid, String pass) throws InterruptedException
	{
		//signup.click();	

		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/ul[2]/li/a")).click();	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
    	username.sendKeys(userid);
		password.sendKeys(pass);
		loginbutton.click();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		
		if(wronglogin.getText().equals("Wrong Account or Password."))
		{
			System.out.println(wronglogin.getText());
			ok.click();
			Thread.sleep(1000);
			System.out.println("Execute false");

			Assert.assertTrue(false);
		}
		else
		{
			System.out.println("Execute true");

			Assert.assertTrue(true);
		}

	}
	
}
