package February03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current URl of the page:"+driver.getCurrentUrl());
		
		
		Actions act=new Actions(driver);
		
	WebElement morebtn=	driver.findElement(By.xpath("//a[text()=\"More\"]"));
    WebElement progressbar= driver.findElement(By.xpath("//a[@href=\"ProgressBar.html\"]"));
		
		
		act.moveToElement(morebtn).click().moveToElement(progressbar).click().build().perform();
		
		
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current URl of the page:"+driver.getCurrentUrl());
		
		
WebElement dwnbtn=driver.findElement(By.xpath("//button[@class=\"btn btn-block btn-primary active\"]"));
		dwnbtn.click();
		System.out.println(dwnbtn.getAttribute("class"));

		
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current URl of the page:"+driver.getCurrentUrl());
		
		
	String attributevalue=	driver.findElement(By.id("cricle-btn")).getAttribute("id");
		
		System.out.println(attributevalue);
	}

}
