package Bai6;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.navigate().to("https://anhtester.com/admin");
	     
	    Thread.sleep(2000);
	     
	     WebElement email=driver.findElement(By.name("email"));
	        email.sendKeys("phuongau0@gmail.com");
	        
	       WebElement password=driver.findElement(By.name("password"));
	       password.sendKeys("phuongnhanma");
	       WebElement btnLogin_Submit=driver.findElement(By.xpath("/html/body/div/div/form/div[5]/input"));
	       btnLogin_Submit.click();
	   
	       
	       WebElement link_Posts=driver.findElement(By.linkText("Posts Management"));
		    link_Posts.click();
		    
		    
		    Thread.sleep(2000);
		  boolean headerPost= driver.findElement(By.xpath(" /html/body/div[1]/div/section[1]/h1")).isDisplayed();
		      
		  //Kiểm tra
		  
		  if(headerPost==true) 
		  {
			  System.out.println("Đã đến trang Posts");
		  }
		  Thread.sleep(2000);
		boolean AddPosts_button=  driver.findElement(By.xpath("//a[@id='btn-dangbai']")).isEnabled();
		 if(AddPosts_button==true) 
		  {
			 driver.findElement(By.xpath("//a[@id='btn-dangbai']")).click();
		  }
		 else
		 {
			 System.out.println("Không click được vào button");
		 }
		 Thread.sleep(2000);
		
		//    WebElement btnLogin_Submit=driver.findElement(By.xpath(""));
		//    WebElement btnLogin_Submit=driver.findElement(By.xpath(""));
		   
		// TODO Auto-generated method stub
		 
		 
		 // Nhập thông tin tittle
		 driver.findElement(By.xpath("(//input[@id='_name_for_slug'])[1]")).sendKeys("PhuongOW");
	//	 driver.findElement(By.xpath("//input[@id='_slug']")).equals();
		 driver.findElement(By.xpath("(//button[contains(text(),'Tạo bài viết')])[1]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'danh')]")).click();
		 Thread.sleep(2000);
		//  boolean headerPost1= driver.findElement(By.xpath(" /html/body/div[1]/div/section[1]/h1")).isDisplayed();
	      
		  //Kiểm tra
		  
		  if(headerPost==true) 
		  {
			  System.out.println("Đã quay về trang Posts");
		  }
		  WebElement dv= driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[3]/a"));
		  Thread.sleep(2000);
		   driver.quit();

	}

}
