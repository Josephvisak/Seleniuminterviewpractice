package jan27;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println("Launching the chrome browser");
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("joseph");
		
		driver.findElement(By.name("lastname")).sendKeys("Visak");
		
		driver.findElement(By.name("reg_email__")).sendKeys("7842042589");
		
		driver.findElement(By.id("password_step_input")).sendKeys("nishu@2345");
		
        WebElement daydropdown=	driver.findElement(By.id("day"));
		
		Select s = new Select(daydropdown);

		Thread.sleep(10000);

		s.selectByValue("28");

		WebElement monthdropdown = driver.findElement(By.id("month"));

		Select month = new Select(monthdropdown);
		
		month.selectByIndex(05);
		Thread.sleep(10000);
		
		//month.selectByVisibleText("june");
		
		List<WebElement> list = month.getOptions();

		for (WebElement l : list) {
			System.out.println(l.getText());
		}
		 driver.findElement(By.name("birthday_year")).sendKeys("1994");

		WebElement yeardropdown = driver.findElement(By.name("birthday_year"));
		Select year = new Select(yeardropdown);

		year.selectByValue("1994");
		

	

		// driver.findElement(By.name("birthday_year")).sendKeys("1994");
		driver.findElement(By.name("sex")).click();

		driver.findElement(By.name("sex")).click();
		
		
		
		
		boolean result = driver.findElement(By.name("sex")).isDisplayed();
		System.out.println(result);

		
		
		driver.findElement(By.name("websubmit")).click();
		
		System.out.println("After clicking on signup:"+driver.getTitle());
		
		
		driver.close();
		
	}

}
