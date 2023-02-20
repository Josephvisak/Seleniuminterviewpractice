package jan30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMlogin {

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
	driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	driver.findElement(By.xpath("//p[text()=\"Forgot your password? \"]")).click();
	
	System.out.println("Title of the page:"+driver.getTitle());
	System.out.println("Current page URL:"+driver.getCurrentUrl());
	
	
	
	
	
	}

}
