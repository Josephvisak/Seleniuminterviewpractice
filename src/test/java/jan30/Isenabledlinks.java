package jan30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabledlinks {

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
WebElement password=driver.findElement(By.xpath("//p[text()=\"Forgot your password? \"]"));
		
		boolean result=password.isEnabled();
		System.out.println("Status of the forgotpasswordlink is enabled or not:"+result);
		
		
		if(password.isEnabled())
		{
		password.click();
		}
		else
		{
		System.out.println("forgotpassword is not enabled");
		}
		
		
	}

}
