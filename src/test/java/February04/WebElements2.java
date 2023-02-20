package February04;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demo.automationtesting.in/Register.html");

		System.out.println("Title of the page:" + driver.getTitle());
		System.out.println("Current URl of the page:" + driver.getCurrentUrl());
		
		
		
List<WebElement>radiobuttons=driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		
		
		
		
		
		for(WebElement radiobutton:radiobuttons)
		{
			Thread.sleep(5000);
		radiobutton.click();
		System.out.println("Attribute of value:"+radiobutton.getAttribute("value"));
		}
	}

}
