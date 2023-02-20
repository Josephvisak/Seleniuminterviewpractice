package jan30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");	
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println("Launching the chrome browser");
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current page URL:"+driver.getCurrentUrl());
		
		
		
WebElement Gender=driver.findElement(By.xpath("(//label[@class=\"col-md-3 col-xs-3 col-sm-3 control-label\"])[5]"));
		
	boolean result=	Gender.isSelected();
		System.out.println(result);
		
		
		if(!Gender.isSelected())
		{
		Gender.click();
		}
		else
		{
		System.out.println("check box is not selected");
		}
		
	WebElement select =	driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		
		select.sendKeys("Engineering");
		
System.out.println("Is displayed status:"+select.isDisplayed());
System.out.println("Is selected status:"+select.isSelected());
 
		
		if(!select.isSelected())
		{
		select.click();
		}
		else
		{
		System.out.println("select box is already selected");	
		}
		 System.out.println("Status of the selected box:"+select.isSelected());

	}

}
