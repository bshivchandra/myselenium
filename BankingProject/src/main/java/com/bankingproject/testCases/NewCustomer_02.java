package com.bankingproject.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.bankproject.pageObject.NewCustomer;

public class NewCustomer_02 extends BaseClass {
	
	@Test
	public void method()
	{
		NewCustomer customer=new NewCustomer(driver);
		customer.customer();
		customer.customername("shiv");
		customer.customergender();
		customer.customerdob("20", "12", "1979");
		customer.customeraddr("marathahalli ba");
		customer.customercity("bangalorepune");
		customer.customerstate("Karnataka");
		customer.customerpinno("185128");
		String mob=randomeNum();
		customer.customermob(mob);
		String mail=randomestring()+"@gmail.com";
		customer.customermail(mail);
		customer.customerpass("234667");
		//customer.submit();
	}

	
}
