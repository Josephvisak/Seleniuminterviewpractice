package February04;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demo.automationtesting.in/Register.html");

		System.out.println("Title of the page:" + driver.getTitle());
		System.out.println("Current URl of the page:" + driver.getCurrentUrl());
		
		
		
List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		
		
             for(WebElement checkbox:checkboxes)
             {
               checkbox.click();
               System.out.println("Get attribute  of:"+checkbox.getAttribute("value"));
             }


		
	}

}
