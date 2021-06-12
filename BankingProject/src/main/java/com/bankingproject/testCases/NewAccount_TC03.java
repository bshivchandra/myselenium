package com.bankingproject.testCases;

import org.testng.annotations.Test;

import com.bankproject.pageObject.NewAccount;

public class NewAccount_TC03 extends BaseClass {
	
	@Test
	public void account()
	{
		NewAccount acc=new NewAccount(driver);
		acc.newAccountopen();
		acc.newAccountId("24860");
		acc.newAccountType();
		acc.deposit("345678");
		acc.submit();
	}

}
