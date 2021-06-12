package com.bankproject.utility;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	Properties pro;
	
		 public Readconfig()
	{
		try {
		File scr=new File("C:\\Users\\shiv\\eclipse-workspace2\\BankingProject\\configuration\\config.properties");
		FileInputStream fis=new FileInputStream(scr);
		pro=new Properties();
		pro.load(fis);
		}catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}
	}
	public String getUrl()
	{
		String url=pro.getProperty("baseurl");
		return url;
	}
	public String getusername()
	{
		String username=pro.getProperty("username");
		return username;
	}
	public String getpassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
}
