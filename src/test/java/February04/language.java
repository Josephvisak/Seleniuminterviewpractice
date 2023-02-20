package February04;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class language {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demo.automationtesting.in/Register.html");

		System.out.println("Title of the page:" + driver.getTitle());
		System.out.println("Current URl of the page:" + driver.getCurrentUrl());
		
		


 driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
 
 List<WebElement> languages=driver.findElements(By.xpath("//a[@class=\"ui-corner-all\"]"));
 
 
 
 
 
 
 
/*		
		for(WebElement language:languages)
		{
		if(language.getText().contains("English"))
		{	
			language.click();
			System.out.println("Status of the dropdown:"+language.isSelected());
			System.out.println(language.getAttribute("id"));
	}
		}*/
			
 
 
 
/* for(WebElement language:languages)
 {
if(language.getText().contains("German"))
{
language.click();
}
System.out.println(language.getAttribute("class"));
System.out.println(language.isDisplayed());
 }
}*/
 
 
 
 
 
 
 
 
 
 for(WebElement language:languages)
 {
 if(language.getText().contains("French"))
 {
 language.click();
 }
 System.out.println(language.getAttribute("class"));
 }
 
// javascriptexecutor js=(javascrptexecutor)driver;
// js.executesscript("window.scrollBy(0,500)," "");
// 
// 
// 
// 
	}
 
	}
 
 
