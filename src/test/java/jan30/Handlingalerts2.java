package jan30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlingalerts2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Launching the chrome Browser");
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current URL of the page:"+driver.getCurrentUrl());
		
		
		
	WebElement  switchto	=driver.findElement(By.xpath("//a[text()=\"SwitchTo\"]"));
	WebElement alerts=driver.findElement(By.xpath("//a[text()=\"Alerts\"]"));
	
		
		
		Actions a =new Actions(driver);
		a.moveToElement(switchto).moveToElement(alerts).click().build().perform();
		


WebElement 	alertwithtxtbox	=driver.findElement(By.xpath("//a[text()=\"Alert with Textbox \"]"));
		
		alertwithtxtbox.click();
		
		
	WebElement promptbox=driver.findElement(By.xpath("//button[text()=\"click the button to demonstrate the prompt box \"]"));
		
		promptbox.click();
		
		
		
	Alert m=driver.switchTo().alert();
	System.out.println("Title of the alert is"+m.getText());
		m.sendKeys("josephvisak");
		Thread.sleep(5000);
		m.accept();

  WebElement  homelink=driver.findElement(By.xpath("//a[text()=\"Home\"]"));
		homelink.click();
		
		
		
		
	}

}
