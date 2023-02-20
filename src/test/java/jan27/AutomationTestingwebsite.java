package jan27;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationTestingwebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");	
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println("Launching the chrome browser");
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		
		
		

		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("joseph");
	    driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("visak");
	    driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("21-48-22,Gajuwaka,visakhapatnam-530044");
		driver.findElement(By.xpath("//span[@aria-labelledby=\"select2-country-container\"]")).sendKeys("India");
		driver.findElement(By.xpath("//select[@id=\"countries\"]")).sendKeys("India");
		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("josephvisak175@gmail.com");
	    driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys("8309064618");
		driver.findElement(By.xpath("//input[@ng-model=\"radiovalue\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"checkbox1\"]")).click();
		driver.findElement(By.xpath("//div[@style=\"min-height:30px;max-width:200px\"]")).sendKeys("English");
		driver.findElement(By.xpath("//input[@ng-model=\"Password\"]")).sendKeys("visak@1994");
		driver.findElement(By.xpath("//input[@id=\"secondpassword\"]")).sendKeys("visak@1994");
		driver.findElement(By.xpath("//select[@placeholder=\"Year\"]")).sendKeys("1994");
		driver.findElement(By.xpath("//select[@placeholder=\"Month\"]")).sendKeys("June");
		driver.findElement(By.xpath("//select[@id=\"daybox\"]")).sendKeys("28");
		driver.findElement(By.xpath("//span[@aria-haspopup=\"true\"]")).sendKeys("india");
		driver.findElement(By.xpath("//span[@aria-labelledby=\"select2-country-container\"]")).sendKeys("India");
		driver.findElement(By.xpath("//select[@ng-model=\"Skill\"]")).sendKeys("Engineering");
		driver.findElement(By.xpath("//span[@class=\"select2-selection select2-selection--single\"]")).sendKeys("India");
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();

		driver.findElement(By.xpath("//span[@aria-haspopup=\"true\"]")).sendKeys("india");
		
		
		//driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		
		
		
		driver.findElement(By.xpath("//div[@class=\"ui-autocomplete-multiselect ui-state-default ui-widget\"]")).sendKeys("English");
        driver.findElement(By.xpath("//span[@role=\"combobox\"]")).sendKeys("india");
       
		driver.findElement(By.xpath("//button[@class=\"btn btn-success navbar-toggle\"]")).click();

		
		
	
		
		

		
	}

}
