package February03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slidderpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
WebElement slidderbtn=driver.findElement(By.xpath("//a[text()=\"Slider\"]"));	
		
		slidderbtn.click();	
		
	
		
WebElement iframe=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		
		driver.switchTo().frame(0);
		
		
		
		
		
		Actions act= new Actions(driver);

		WebElement slider=driver.findElement(By.xpath("//div[@id=\"slider\"]"));

		
		Thread.sleep(5000);
		act.clickAndHold().dragAndDropBy(slider, 250, 0).build().perform();
		
		
		act.clickAndHold().dragAndDropBy(slider, -500, 0).build().perform();
		
		

		
	
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}

}
