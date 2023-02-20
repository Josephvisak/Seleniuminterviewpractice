package February03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Loader.html");
		
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current URl of the page:"+driver.getCurrentUrl());
		
		
WebElement runbutton=driver.findElement(By.xpath("//button[@id=\"loader\"]"));
		
	runbutton.click();
	
	WebElement closebutton=driver.findElement(By.xpath("//button[text()=\"Close\"]"));
	//closebutton.click();
	
	// explicitwait
	
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	WebElement newElement=wait.until(ExpectedConditions.elementToBeClickable(closebutton));
	
	newElement.click();
	
	

	closebutton.isDisplayed(); 
	System.out.println(closebutton.isDisplayed());
		
		
		WebElement title=driver.findElement(By.xpath("//h4[text()=\"Modal title\"]"));
		
		System.out.println("Title after loading:"+title.getText());
	
		
		
		boolean result=closebutton.isDisplayed();
		System.out.println(result);	
		
	String status= closebutton.getText();
		System.out.println(status);
		
		
		
		
		
		
	}

}
