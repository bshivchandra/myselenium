package com.bankproject.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccount {

	WebDriver driver;
	public NewAccount(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="cusid")
	WebElement cusid;
	
	@FindBy(name="selaccount")
	WebElement acctype;
	
	@FindBy(name="inideposit")
	WebElement deposit;
	
	@FindBy(name="button2")
	WebElement submit;
	
	@FindBy(name="reset")
	WebElement reset;
	
	public void newAccountopen()
	{
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a")).click();
	}
	public void newAccountId(String id)
	{
		cusid.sendKeys(id);
	}
	public void newAccountType()
	{

		Select select=new Select(acctype);
		select.selectByVisibleText("Current");
	}
	public void deposit(String cash)
	{
		deposit.sendKeys(cash);
	}
	public void submit()
	{
		submit.click();
	}
	
	
}
