package com.bankproject.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Withdrawal {
	WebDriver driver;
	
	public Withdrawal(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="accountno")
	WebElement accountno;
	
	@FindBy(name="ammount")
	WebElement ammount;
	
	@FindBy(name="desc")
	WebElement desc;
	
	@FindBy(name="AccSubmit")
	WebElement submit;
	
	
	public void withdrawal()
	{
		
	}
	public void withdrawal(String accno,String ammou)
	{
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a")).click();
		accountno.sendKeys(accno);
		ammount.sendKeys(ammou);
		desc.sendKeys(ammou+" rupees withdrawl from accountno "+accno);
	}
	public void submit()
	{
		submit.click();
	}
	

}
