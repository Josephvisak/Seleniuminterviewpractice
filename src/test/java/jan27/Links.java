package jan27;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");	
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Launching the chrome browser");
		driver.get("https://www.facebook.com/");
		System.out.println("Current page URL:"+driver.getCurrentUrl());
		System.out.println("Title of the page:"+driver.getTitle());
		
        driver.findElement(By.linkText("Forgotten password?")).click();
        System.out.println("Current page URL:"+driver.getCurrentUrl());
		System.out.println("Title of the page:"+driver.getTitle());
		
		driver.quit();
	}

}
