package February03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demo.automationtesting.in/JqueryProgressBar.html");

		System.out.println("Title of the page:" + driver.getTitle());
		System.out.println("Current URl of the page:" + driver.getCurrentUrl());

		WebElement downloadbutton = driver.findElement(By.xpath("//button[@id=\"downloadButton\"]"));

		downloadbutton.click();

		WebElement completetext = driver.findElement(By.xpath("//div[@class=\"progress-label\"]"));

		System.out.println("Whether it is downloaded:" + completetext.getText());
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);

		boolean newElement = wait.until(ExpectedConditions.textToBePresentInElement(completetext, "Complete!"));

		System.out.println(newElement);

		driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
		
		
		
		
		
		


		
		
		
		
		
		
		
		
	}

}
