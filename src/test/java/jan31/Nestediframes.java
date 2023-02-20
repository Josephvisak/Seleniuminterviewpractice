package jan31;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nestediframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Launching the browser");
		
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		
		System.out.println("Title of the page :"+driver.getTitle());
		System.out.println("Current URL of the page :"+driver.getCurrentUrl());
		
		
	
	WebElement iframewithiniframebutton=driver.findElement(By.xpath("//a[@href=\"#Multiple\"]"));
	
		iframewithiniframebutton.click();
		
		
		WebElement outerframe= driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(1);
		
		
String outerframetext=driver.findElement(By.tagName("h5")).getText();
		
		System.out.println("Text of the outerframe:"+outerframetext);
		
		
		// child frame begins
		
		
		WebElement innerframe = driver.findElement(By.xpath("(//iframe[@src=\"SingleFrame.html\"])[1]"));

		driver.switchTo().frame(0);

		String innertext = driver.findElement(By.tagName("h5")).getText();

		System.out.println(innertext);
		
		
		WebElement inputtext=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		Thread.sleep(5000);
		
		inputtext.sendKeys("josephnishitha");
		
		
		//switch to outerframe
		
		driver.switchTo().parentFrame();
		
		
		// switch to default content
		
		driver.switchTo().defaultContent();
		
		// click on home link
		
WebElement homelink=driver.findElement(By.xpath("//a[text()=\"Home\"]"));
		
		homelink.click();
		
		System.out.println("Title of the page :"+driver.getTitle());
		System.out.println("Current URL of the page :"+driver.getCurrentUrl());
		
		
	}

}
