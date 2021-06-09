package practice;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenUrl {
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiv\\eclipse-workspace2\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.get("https://solutionstouch.com/");
	       driver.manage().window().maximize();    
	       	
	       driver.get("https://solutionstouch.com/");
	       

	       int linkcount=driver.findElements(By.tagName("a")).size();
	       System.out.println(linkcount);
	       
	      
	       List<WebElement> links= (List<WebElement>) driver.findElements(By.tagName("a"));	
	       int i=0;
	       for(WebElement link : links)
	       {
	    	   i++;
	    	   String url= link.getAttribute("href");  
	    	   HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
		       conn.setRequestMethod("HEAD");
		       conn.connect();
		       int resposeCode=conn.getResponseCode();
		       System.out.println(resposeCode);
		       
		       if(resposeCode>=400)
		       {
		    	 System.out.println("link is broken "+link.getText()+"  " + i); 
		    	 Assert.assertTrue(false);
		   		      
		       }
		       else {
		    	   System.out.println("link is not broken "+link.getText()+ "  " +  i); 
		       }      
	       }
	       driver.quit();
 }
}
