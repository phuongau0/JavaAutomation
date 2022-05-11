package Vidu;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Initialization.*;
public class TaoHoSoMedpro extends Init {
	public static void main(String[] args) throws InterruptedException 
	{
		Setup();
		
		 driver.navigate().to("https://medpro.vn/");
	        
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
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
	     
	       boolean check= driver.findElement(By.xpath("//button[@type='button']//i[@class='fal fa-bell']")).isDisplayed();
		      
			  //Kiểm tra
			  
			  if(check==true) 
			  {
				System.out.println("Đã đăng nhập thành côg -> Pass") ;
				   Thread.sleep(1000);
			  }
	       //- Đăng nhập xong click vô trang cá nhanA
			  
			  Thread.sleep(2000);
	       driver.findElement(By.xpath("//button[normalize-space()='123']")).click();
	       
	       // Click vào hồ sơ để tạo hồ sơ
	       driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
	       
	       
	       /// click vào button thêm hồ sơ
	       driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
	       
	       // Điền thông tin
	      
	       // Tên
	       driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Test 123");
	       //Date
	       // Chọn ngày sinh 
	       Select dropdownNGS = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/select[1]")));
	       dropdownNGS.selectByValue("29");
	    // Chọn THÁNG sinh 
	       
	       Select dropdownTS = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/select[2]")));
	       dropdownTS.selectByValue("12");
	       
// Chọn NĂM  sinh 
	       
	       Select dropdownNS = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/select[3]")));
	       dropdownNS.selectByValue("2000");
	       // SSo dien thoại
	       driver.findElement(By.xpath("//input[@id='label_sdt']")).sendKeys("0778203811");
	       //Gioi tinh
	       
	       driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[4]/select[1]")).click();
	       Select GioiTinh = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[4]/select[1]")));
	       GioiTinh.selectByValue("Nam");
	       
       
	       
	       // Nghe Nghiẹp
	       Select NgheNghiep = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[4]/select[1]")));
	       NgheNghiep.selectByIndex(3);
	       
	       //------------------------------------------------
	       // Kéo xuống
	       WebElement textCheckAll=	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[4]/select[1]"));
	   	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", textCheckAll);
	       
	       
	
	       
	       /// TỈnh thành (chọn đại hoi)
	       
	       Select dropdownTT = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[9]/input[1]")));
	       dropdownTT.selectByIndex(3); 
	       
	       Select dropdownQH = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[10]/input[1]")));
	       dropdownQH.selectByIndex(3); 

	       Select dropdownPX = new Select(driver.findElement(By.id("//body/div[@id='root']/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[11]/input[1]")));
	       dropdownPX.selectByIndex(3); 

	       // Đại chri
	       
	  
	       
	       driver.findElement(By.xpath("   //body/div[@id='root']/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[11]/input[1]")).sendKeys("12345");
	       
	       
	       // CLick tọa mới
	       
	       driver.findElement(By.xpath("//div[contains(text(),'Tạo mới')]")).click();
	       
	       ///
	     boolean textDo=driver.findElement(By.xpath(" //span[contains(text(),'Vui lòng nhập số nhà, đường, thôn (ấp), xóm!')]")).isDisplayed();
	    
	    
	       if(textDo==true)
	       {
	    	   System.out.printf("ko tao ho so do chua nhap du thong tin");
	       }
	       
	      // WebElement linklabelHSBN=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
	     //  System.out.print(linklabelHSBN.getText());
	       
	    //	linklabelHSBN.click();   
	       
	       
	       
	       btn_DangNhap2.click();
	        Thread.sleep(1000);
	        
	        
		TearDown();
	}
}
