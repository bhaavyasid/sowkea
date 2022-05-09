package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

 public static ChromeDriver driver;
 @BeforeMethod()

	public void base(){
		 WebDriverManager.chromedriver().setup();
		   
		    //to handle notifications in websites
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("--disable-notifications");
		        
		driver = new ChromeDriver(options);
			//Entering url
			driver.get("https://www.sowkea.com/");
			//maximize the window
			driver.manage().window().maximize();
			
			//wiats
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

}
