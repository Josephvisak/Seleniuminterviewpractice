package February04;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolltowebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demo.automationtesting.in/Register.html");

		System.out.println("Title of the page:" + driver.getTitle());
		System.out.println("Current URl of the page:" + driver.getCurrentUrl());
		
		
		
WebElement confirmpassword=driver.findElement(By.xpath("(//input[@type=\"password\"])[2]"));
		
	//confirmpassword.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	
		//scroll down
		js.executeScript("arguments[0].scrollIntoView();", confirmpassword);
		
		
		
		
		
		
		
		
	}

}
