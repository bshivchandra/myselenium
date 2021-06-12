package com.bankingproject.testCases;

import org.testng.annotations.Test;

import com.bankproject.pageObject.MiniStatement;

public class MiniStatement_05 extends BaseClass{
	 
	@Test
	public void statement()
	{
		MiniStatement state=new MiniStatement(driver);
		state.ministatement();
		state.ministatement("93797");
		state.miniStatementF("11", "06", "2021");
		state.miniStatementT("12", "06", "2021");
		state.transaction("456", "1234");
	
	}

}
