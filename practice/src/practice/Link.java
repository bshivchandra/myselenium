package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiv\\eclipse-workspace2\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.get("https://solutionstouch.com/");
	       driver.manage().window().maximize();
	       
	       System.out.println(driver.findElements(By.tagName("a")).size());
	       
	       WebElement footerdriver=driver.findElement(By.cssSelector("footer.footer"));
	       System.out.println(footerdriver.findElements(By.tagName("a")).size());
	       
	       int linkcount=footerdriver.findElements(By.tagName("a")).size();
	       
	       for(int i=0;i<linkcount;i++)
	       {
	    	   String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
				
				footerdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
				Thread.sleep(5000L);
				
			}// opens all the tabs
			
	        Set<String> abc=driver.getWindowHandles();//4
			java.util.Iterator<String> it=abc.iterator();
			
		/*	String parentId = it.next();
			String childId = it.next();
			driver.switchTo().window(childId);
        */
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			
			while(it.hasNext())
			{  
			   driver.switchTo().window(it.next());
			   System.out.println(driver.getTitle());
			 
			}
			driver.manage().deleteAllCookies();
			driver.quit();
	
	}

}
