package February04;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demo.automationtesting.in/Register.html");

		System.out.println("Title of the page:" + driver.getTitle());
		System.out.println("Current URl of the page:" + driver.getCurrentUrl());
		
		
		
		// how to perform scrolling actions on web application
		
		// scroll down
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)","");
		
		
		Thread.sleep(5000);
		
		
		js.executeScript("window.scrollBy(0,-500)","");
		
		
		
//		
////	javascriptExecutor js=(javascriptExecutor)driver;
//       js.executescript("window.scrollby(0,500)","");
////		
////		
////		
////		
//		javascriptexecutor js= (javascriptexecutor)driver;
//		
//		js.executescript("window.scrollby(0,-500)","");//scrollup means -
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
