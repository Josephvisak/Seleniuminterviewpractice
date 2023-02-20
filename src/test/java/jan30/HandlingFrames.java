package jan30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Launching the chrome Browser");
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current URL of the page:"+driver.getCurrentUrl());
		
		
		
		//driver.switchTo().frame("singleframe");
		driver.switchTo().frame(0);
WebElement inputtext=driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
		
		inputtext.sendKeys("josephvisak");
		
		System.out.println(inputtext.getText());
		
		
		driver.switchTo().defaultContent();

WebElement Homelink =driver.findElement(By.xpath("//a[text()=\"Home\"]"));
		Homelink.click();
		
		
		
		
		
		
		
	}

}
