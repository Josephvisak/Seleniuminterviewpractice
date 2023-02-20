package jan27;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println("Launching the chrome browser");
		driver.get("https://www.facebook.com/");
		
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current URl of the page:"+driver.getCurrentUrl());
		
		
		
		driver.navigate().to("https://www.amazon.in/");
		
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current URl of the page:"+driver.getCurrentUrl());
		
		// simulation browser back button
		
		driver.navigate().back();
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current URl of the page:"+driver.getCurrentUrl());
		
		//simulating browser forward button
		
		driver.navigate().forward();
		
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current URl of the page:"+driver.getCurrentUrl());
		
		// reload the page
		System.out.println("Refresh the page");
		driver.navigate().refresh();
		
		driver.close();
		
	}

}
