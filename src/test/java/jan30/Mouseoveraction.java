package jan30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoveraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("Launching the Browser");
		
		driver.navigate().to("https://jqueryui.com/");
		
	System.out.println("Title of the page:"+driver.getTitle());
	System.out.println("Current page URL:"+driver.getCurrentUrl());
	
	WebElement JSfoundation=driver.findElement(By.xpath("//a[text()=\"JS Foundation\"]"));


	Actions act = new Actions(driver);
	act.moveToElement(JSfoundation).click().perform();
	
	
System.out.println("Title of the page:"+driver.getTitle());
System.out.println("Current page URL:"+driver.getCurrentUrl());
	
	
WebElement leadership=driver.findElement(By.xpath("//a[text()=\"Leadership\"]"));

act.moveToElement(JSfoundation).moveToElement(leadership).click().build().perform();

System.out.println("Title of the page:"+driver.getTitle());
System.out.println("Current page URL:"+driver.getCurrentUrl());



Thread.sleep(5000);






WebElement donate=driver.findElement(By.xpath("//a[text()=\"Donate\"]"));


act.moveToElement(JSfoundation).moveToElement(donate).build().perform();

System.out.println("Title of the page:"+driver.getTitle());
System.out.println("Current page URL:"+driver.getCurrentUrl());




	}

}
