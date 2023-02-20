package jan30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabledbbuttonex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("Launching the Browser");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current page URL:"+driver.getCurrentUrl());
		
		
		
		
		
		
		driver.findElement(By.xpath("//input[@name=\"username\"]"))	.sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		WebElement button=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	    button.click();
	  
		
//
//	 if(button.isEnabled())
//	{
//	 button.click();
//		
//
//	}
//	 else
//	{
// System.out.println("Button is not enabled");	
//
//	}	
//		
//	
//		System.out.println("Title of the page:"+driver.getTitle());
//		System.out.println("Current page URL:"+driver.getCurrentUrl());
	
	
	
}
		
	}
		
	


