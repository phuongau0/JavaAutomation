package Vidu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Medpro {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\Java\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		   
	        //1 - Maximize browser của mình
	        driver.manage().window().maximize();

	        //2 - Đi đến 1 url
	        
	        driver.navigate().to("https://medpro.vn/");
	        
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        //3 - Lấy Title và in ra console
	        
	      //  System.out.println(driver.getTitle());

	        Thread.sleep(2000);
	    //Click đăng nhập
	        
	        WebElement btn_DangNhap=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/nav/div[1]/ul/li[2]/a"));
	        btn_DangNhap.click();
	        Thread.sleep(2000);
	        
	       WebElement txtSDT=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div[2]/div/div[1]/div/div/input"));
	       txtSDT.sendKeys("0778203811");
	       Thread.sleep(2000);
	        WebElement btn_Submit_Login=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div[2]/div/div[2]/button"));
	        btn_Submit_Login.click();
	        Thread.sleep(2000);
	        WebElement txtpassword=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div[2]/div/div[1]/div[2]/div/input"));
	        txtpassword.sendKeys("123456");
	        
	        
	       WebElement btn_DangNhap2=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div[2]/div/div[2]/button"));
	       btn_DangNhap2.click();
	     
	     
	        Thread.sleep(1000);
	        
//	      WebElement btnLogin_Submit=driver.findElement(By.xpath(""));
			//    WebElement btnLogin_Submit=driver.findElement(By.xpath(""));
	        boolean check= driver.findElement(By.xpath("//button[@type='button']//i[@class='fal fa-bell']")).isDisplayed();
		      
			  //Kiểm tra
			  
			  if(check==true) 
			  {
				System.out.println("Đã đăng nhập thành côg -> Pass") ;
				   Thread.sleep(1000);
			  }
			//  Thread.sleep(3000);
			WebElement dk=driver.findElement(By.xpath("//a[@href='/']//div[contains(@class,'lazyload-wrapper')]//img"));
			dk.click();
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dk);
			
			   Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Tìm nhanh bệnh viện']")).sendKeys("Nhi đồng");
			   Thread.sleep(1000);
			//	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]")).click();
		var listbv=driver.findElements(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li"));
		//body/div[@id='root']/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]
		
		System.out.println("Có 2 bệnh viện có tên Nhi đồng:"+listbv.size()) ;
			//	driver.findElement(By.xpath("//tbody/tr[1]/td[4]/button[1]")).click();
				for(int i=0;i<listbv.size();i++)
				{
					WebElement tenBV=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li["+(i+1)+"]/div[1]"));
					System.out.println("Là bệnh viện:"+tenBV.getText());
				}
			//-------- Luồng đặt khám
				
			   Thread.sleep(1000);
		    //WebElement btnDangBai=driver.findElement(By.cssSelector("[backg"));
		   // tagnameDiv.getText();
	        driver.quit();
	        
	        
	}
}


