package Bai7;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class VdveFrame {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.navigate().to("https://testpages.herokuapp.com/styled/frames/frames-test.html");
	    driver.switchTo().frame("middle");
	    Thread.sleep(2000);
	    String itemMiddle=driver.findElement(By.xpath("//li[@id='middle0']")).getText();
	    System.out.print(itemMiddle);
	    
	    driver.quit();
	}
}
