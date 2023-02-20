package February1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println("Launching the chrome Browser");
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");

		WebElement iframebtn = driver.findElement(By.xpath("//a[@href=\"#Multiple\"]"));

		iframebtn.click();

		WebElement parentframe = driver
				.findElement(By.xpath("//div[@id=\"Multiple\"]/iframe[@src=\"MultipleFrames.html\"]"));

		driver.switchTo().frame(1);

		// driver.switchTo().frame(parentframe);

		String innertext = driver.findElement(By.tagName("h5")).getText();

		System.out.println(innertext);

		WebElement intext = driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));

		driver.switchTo().frame(0);

		WebElement childframetext = driver.findElement(By.tagName("h5"));
		childframetext.getText();

		System.out.println(childframetext.getText());

		WebElement inputtext = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		Thread.sleep(5000);
		inputtext.sendKeys("josephvisak");

		System.out.println("Title of the page:" + driver.getTitle());
		System.out.println("Current URL of the page:" + driver.getCurrentUrl());

		// switch to parent frame

		driver.switchTo().parentFrame();

		// default content

		driver.switchTo().defaultContent();

		WebElement homelink = driver.findElement(By.xpath("//a[text()=\"Home\"]"));

		homelink.click();
	
	
		
	}

}
