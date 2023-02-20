package jan30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homelink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");	
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println("Launching the chrome browser");
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current page URL:"+driver.getCurrentUrl());
		
		
	// Homelink	
		
WebElement homelink=driver.findElement(By.xpath("//a[text()=\"Home\"]"));
		homelink.click();

		System.out.println("Status of the Homelink:"+homelink.isEnabled());
		
		
		
		
	}

}
