package Initialization;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Init {

	public static WebDriver driver=null;
	//@BeforeTest
	public static void Setup() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    
	 
	 //   Thread.sleep(2000);
	}
	public static void TearDown() 
	{
		//Thread.sleep(2000);
		System.out.print("DOne");
		driver.quit();
	}
}
