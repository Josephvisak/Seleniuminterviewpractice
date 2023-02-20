package jan30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");	
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println("Launching the chrome browser");
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		System.out.println("Current page URL:"+driver.getCurrentUrl());
		System.out.println("Title of the page:"+driver.getTitle());
		
		
	WebElement washinton=driver.findElement(By.xpath("//div[@id=\"box3\"]"));
	WebElement italy= driver.findElement(By.xpath("(//div[@class=\"dragableBoxRight\"])[1]"));
		
		
		Actions act= new Actions(driver);
		
		act.dragAndDrop(washinton, italy).build().perform();
		
WebElement rome	=driver.findElement(By.xpath("(//div[text()=\"Rome\"])[2]"));
WebElement spain=driver.findElement(By.xpath("//div[text()=\"Spain\"]"));	
		

act.dragAndDrop(rome, spain).build().perform();









	}

}
