package February1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling2 {

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
		
		
		
WebElement	newseperatewindow	=driver.findElement(By.xpath("//a[text()=\"Open New Seperate Windows\"]"));
		
		newseperatewindow.click();
		
		
		
	WebElement newwindowbutton=driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]"))	;
		
		newwindowbutton.click();
		
		System.out.println("Title of the page:" + driver.getTitle());
		System.out.println("Current URL of the page:" + driver.getCurrentUrl());
		
String parentwindowhandle= driver.getWindowHandle();
		
		System.out.println(parentwindowhandle);
		
		
		
Set<String>	windowids=driver.getWindowHandles();


for(String windowID:windowids)
{
System.out.println(windowID);
{
if(!windowID.contentEquals(parentwindowhandle));
}
driver.switchTo().window(windowID);
}


System.out.println("Title of the page:" + driver.getTitle());
System.out.println("Current URL of the page:" + driver.getCurrentUrl());

//    Set<String>windowids=driver.getwindowhandles();
//iterator<String>itr=windowids.iterator();
//String windowid1=itr.next();
//String windowid2=itr.next();
//driver().switchTo().window(windowid2);
//
//
//
//



	}

}
