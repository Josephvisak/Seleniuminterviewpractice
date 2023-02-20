package February1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println("Launching the chrome Browser");
		driver.navigate().to("https://demo.automationtesting.in/Windows.html");
		System.out.println("Title of the page:" + driver.getTitle());
		System.out.println("Current URL of the page:" + driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		
		
	WebElement	newtabbedwindow=driver.findElement(By.xpath("//a[@href=\"#Tabbed\"]"));
		
	newtabbedwindow.click();
		
	WebElement btnclick=driver.findElement(By.xpath("(//button[@class=\"btn btn-info\"])[1]"));
	btnclick.click();
		
	System.out.println("Title of the page:" + driver.getTitle());
	System.out.println("Current URL of the page:" + driver.getCurrentUrl());
	System.out.println(driver.getWindowHandle());
	
	String  parentwindowhandleid= driver.getWindowHandle();
	
	System.out.println(parentwindowhandleid);
	
	
Set<String>windowids=driver.getWindowHandles();
	
	for(String windowId:windowids)
	{
	System.out.println(windowId);
	if(!windowId.contentEquals(parentwindowhandleid))
	{
	driver.switchTo().window(windowId);
	System.out.println("Title of the page:" + driver.getTitle());
	System.out.println("Current URL of the page:" + driver.getCurrentUrl());
	
	}
	
	}
	
	
	
	}
	
	
}
		
	


