package jan27;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");	
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println("Launching the chrome browser");
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		
	
		
WebElement language=driver.findElement(By.xpath("//div[@class=\"ui-autocomplete-multiselect ui-state-default ui-widget\"]"));


Select m= new Select(language);
m.selectByVisibleText("English");
Thread.sleep(10000);
m.selectByValue("10");



driver.findElement(By.xpath("//select[@ng-model=\"Skill\"]")).sendKeys("Engineering");
driver.findElement(By.xpath("//span[@class=\"select2-selection select2-selection--single\"]")).sendKeys("India");
	}

}
