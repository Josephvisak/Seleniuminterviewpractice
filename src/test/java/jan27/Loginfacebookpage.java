package jan27;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginfacebookpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");	
		
	WebDriver driver= new ChromeDriver();	
		
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	System.out.println("Launching the chrome browser");
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("josephvisak");
	driver.findElement(By.id("pass")).sendKeys("visak@1993");
	driver.findElement(By.name("login")).click();
	System.out.println("After login to the browser:"+driver.getTitle());
	
	driver.close();	
		
		
		
		
		
		
		
		
	}

}
