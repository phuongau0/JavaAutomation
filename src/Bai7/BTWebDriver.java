package Bai7;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BTWebDriver
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	    
	    // Login vào
		 WebElement txtUsername =driver.findElement(By.xpath("//input[@id='txtUsername']"));
		 txtUsername.sendKeys("Admin");
		 WebElement txtPassword =driver.findElement(By.xpath("//input[@id='txtPassword']"));
		 txtPassword.sendKeys("admin123");
		 driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	//	 System.out.print("Đã đăng nhập thành công ");
		 boolean KiemTra=driver.findElement(By.xpath("//h1[normalize-space()='Dashboard']")).isDisplayed();
		 if(KiemTra==true)
		 {
			 System.out.print("Đã đăng nhập thành công ");
		 }
		 driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		//    WebElement btnLogin_Submit=driver.findElement(By.xpath(""));
		 
		 
		 // Lấy tất cả các đối tượng là thẻ TH trong bảng Table(HMTL)
		 List <WebElement> thList= driver.findElements(By.xpath("//th"));
		 for(int i=0;i<thList.size();i++)
		 {
			 System.out.println(thList.get(i).getText());
		 }
	    Thread.sleep(2000);
	    //cmt
	    
		  driver.quit();

	}
}