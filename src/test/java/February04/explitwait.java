package February04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Loader.html");
		
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current URl of the page:"+driver.getCurrentUrl());
		
		
		
		
		
WebElement runbtn=driver.findElement(By.xpath("//button[text()=\"Run\"]"));
		
		runbtn.click();
		
		
		
	
		
		
	WebElement closebtn=driver.findElement(By.xpath("//button[text()=\"Close\"]"));
		
		
		
		
		WebDriverWait wait =new WebDriverWait(driver, 30);
WebElement newelement=wait.until(ExpectedConditions.elementToBeClickable(closebtn));
		
		newelement.click();
		
	
		
WebElement  text=driver.findElement(By.xpath("//h4[text()=\"Modal title\"]"));
		
		System.out.println("After loading:"+text.getText());
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current URl of the page:"+driver.getCurrentUrl());
		
	}

}
