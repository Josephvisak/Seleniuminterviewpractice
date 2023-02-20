package February04;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Loader.html");
		
		System.out.println("Title of the page:"+driver.getTitle());
		System.out.println("Current URl of the page:"+driver.getCurrentUrl());
		
		
		
		// screen shot
		
		TakesScreenshot ts= (TakesScreenshot)driver;
	File srcfile=ts.getScreenshotAs(OutputType.FILE);
		File destlocation= new File("./screenshots","screenshot.png");
		
		FileUtils.copyFile(srcfile,destlocation);
		
		
		
		
	}

}
