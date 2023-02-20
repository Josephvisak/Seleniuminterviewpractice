package February03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slidder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/");
		
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current URl of the page:"+driver.getCurrentUrl());
		
		
		
	WebElement sliderbtn=	driver.findElement(By.xpath("//a[text()=\"Slider\"]"));
		
		sliderbtn.click();
		
		
		
	WebElement iframe=driver.findElement(By.xpath("//iframe[@src=\"/resources/demos/slider/default.html\"]"));
		
		driver.switchTo().frame(0);
		
		
		//slidder operation
		
		Actions act =new Actions(driver);
		
	WebElement	slidder = driver.findElement(By.xpath("//div[@id=\"slider\"]"));
		
		act.clickAndHold().dragAndDropBy(slidder, 500, 0).build().perform();
		
	}

}
