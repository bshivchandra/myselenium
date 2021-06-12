package com.bankingproject.testCases;

import org.testng.annotations.Test;

import com.bankproject.pageObject.Withdrawal;

public class Withdrawal_TC04 extends BaseClass {
	
	@Test
	public void withdrawl()
	{
		Withdrawal with=new Withdrawal(driver);
		with.withdrawal();
		with.withdrawal("93797","44567");
		with.submit();
	}

}
