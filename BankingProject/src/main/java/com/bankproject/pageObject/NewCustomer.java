package com.bankproject.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer {
	WebDriver driver;
	
	public NewCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name="name")
	WebElement customername;
	
	@FindBy(name="rad1")
	WebElement customergender;
	
	@FindBy(name="dob")
	WebElement customerdob;
	
	@FindBy(name="addr")
	WebElement customeraddr;
	
	@FindBy(name="city")
	WebElement customercity;
	
	@FindBy(name="state")
	WebElement customerstate;
	
	@FindBy(name="pinno")
	WebElement customerpinno;
	
	@FindBy(name="telephoneno")
	WebElement customermob;
	
	@FindBy(name="emailid")
	WebElement customermail;
	
	@FindBy(name="password")
	WebElement customerpass;
	
	@FindBy(name="sub")
	WebElement submit;
	
	@FindBy(name="res")
	WebElement res;
	
	public void customer()
	{
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
	}
	public void customername(String name)
	{
		customername.sendKeys(name);
	}
	public void customergender()
	{
		customergender.click();;
	}
	public void customerdob(String dd , String mm , String yy)
	{
		customerdob.sendKeys(dd,mm,yy);
	}
	public void customeraddr(String addr)
	{
		customeraddr.sendKeys(addr);
	}
	public void customercity(String city)
	{
		customercity.sendKeys(city);
	}
	public void customerstate(String state)
	{
		customerstate.sendKeys(state);
	}
	public void customerpinno(String pincode)
	{
		customerpinno.sendKeys(pincode);
	}
	public void customermob(String mob)
	{
		customermob.sendKeys(mob);
	}
	public void customermail(String mail)
	{
		customermail.sendKeys(mail);
	}
	public void customerpass(String pass)
	{
		customerpass.sendKeys(pass);
	}
	public void submit()
	{
		submit.click();
	}
	public void reset()
	{
		res.click();
	}
		
	
}
