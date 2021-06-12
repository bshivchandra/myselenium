package com.bankproject.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiniStatement {
	WebDriver driver; 
		
		public MiniStatement(WebDriver driver)
		{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		@FindBy(name="accountno")
		WebElement accountno;
		
		@FindBy(name="fdate")
		WebElement fdate;
		@FindBy(name="tdate")
		WebElement tdate;
		@FindBy(name="amountlowerlimit")
		WebElement lowerlimit;
		@FindBy(name="numtransaction")
		WebElement numtransaction;
		@FindBy(name="AccSubmit")
		WebElement submit;
		@FindBy(name="res")
		WebElement reset;
		
		
		public void ministatement()
		{
			driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a")).click();
		}
		public void ministatement(String accno)
		{
			accountno.sendKeys(accno);
		}
		public void miniStatementF(String dd, String mm,String yy)
		{
			fdate.sendKeys(dd);
			fdate.sendKeys(mm);
			fdate.sendKeys(yy);
		}
		public void miniStatementT(String dd, String mm,String yy)
		{
			tdate.sendKeys(dd);
			tdate.sendKeys(mm);
			tdate.sendKeys(yy);
		}
		public void transaction(String value,String number)
		{
			lowerlimit.sendKeys(value);
			numtransaction.sendKeys(number);
			submit.click();
			
		}



}
