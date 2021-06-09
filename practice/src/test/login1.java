package test;

import org.testng.annotations.Test;

import verifyloginpage.Verifylogin;

public class login1 extends BaseClass{
	
	@Test
	public void login1() throws InterruptedException    
	{
		Verifylogin login=new Verifylogin(driver);
		login.loginIdPass("bhusse.shiva@gmail.com","shiva2007");

	}
}
