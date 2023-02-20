package jan30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");	
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println("Launching the chrome browser");
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current URl of the page:"+driver.getCurrentUrl());
		
		
		
	WebElement interactions=driver.findElement(By.xpath("//a[text()=\"Interactions \"]"));
		
		Actions act= new Actions(driver);
		
		act.moveToElement(interactions).build().perform();
		
	WebElement draganddrop=	driver.findElement(By.xpath("//a[text()=\"Drag and Drop \"]"));
		
		
		act.moveToElement(interactions).moveToElement(draganddrop).build().perform();
		
		
	WebElement dynamic =driver.findElement(By.xpath("//a[text()=\"Dynamic \"]"));
		
		act.moveToElement(interactions).moveToElement(draganddrop).moveToElement(dynamic).click().build().perform()	;
		
		
		
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current URl of the page:"+driver.getCurrentUrl());
		
		
		
		
		
		
	}

}
