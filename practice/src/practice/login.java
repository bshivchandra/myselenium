package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiv\\eclipse-workspace2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://solutionstouch.com/");
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/ul[2]/li/a")).click();
		driver.findElement(By.xpath("//*[@id=\"loginid\"]")).sendKeys("bhusse.shiva@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"loginpass\"]")).sendKeys("Shiva1234");
		driver.findElement(By.xpath("//*[@id=\"loginuser\"]")).click();
		
		Thread.sleep(1000);
		
        System.out.println(driver.findElement(By.className("modal-body")).getText());
		
		driver.findElement(By.cssSelector("#errormodal>div>div>div.modal-footer>button")).click();


		
        driver.findElement(By.linkText("Forget password!")).click();
        driver.findElement(By.xpath("//*[@id=\"loginid\"]")).sendKeys("bhusse.shiva@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"resetpass\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"errormodal\"]/div/div/div[3]/button")).click();


	}

} 

