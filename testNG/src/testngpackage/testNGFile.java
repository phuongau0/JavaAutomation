package testngpackage;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class testNGFile {


 
    public WebDriver driver=null ; 
  //  public String baseUrl = "https://anhtester.com";

  @BeforeTest
  public void beforeTest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Java\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
     // driver.navigate().to(baseUrl);
    //  Thread.sleep(2000);

   

   Thread.sleep(2000);
     // driver.quit();
  }
  @Test
  public void Demo1() {
	  driver.navigate().to("https://anhtester.");
	  
	  
  }
  
  @Test
  public void Demo2() {
	  driver.navigate().to("https://google.com");
	  
  }

  @Test
  public void Demo3() {
	  driver.navigate().to("https://youtube.com");
	  
  }
  @AfterTest
  public void AfterTest() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
}
}