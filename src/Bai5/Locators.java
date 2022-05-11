package Bai5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\Java\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		   
	        //1 - Maximize browser của mình
	        driver.manage().window().maximize();

	        //2 - Đi đến 1 url
	        
	        driver.navigate().to("https://anhtester.com/admin");
	        

	        //3 - Lấy Title và in ra console
	        
	      //  System.out.println(driver.getTitle());

	        Thread.sleep(2000);
	        
	        //Web Element
	        //CLick vào button Login
	      //  WebElement btnLogin=driver.findElement(By.id("btn-login"));
	      //  btnLogin.click();
	        
	        WebElement email=driver.findElement(By.name("email"));
	        email.sendKeys("phuongau0@gmail.com");
	        
	       WebElement password=driver.findElement(By.name("password"));
	       password.sendKeys("phuongnhanma");
	       WebElement btnLogin_Submit=driver.findElement(By.xpath("/html/body/div/div/form/div[5]/input"));
	       btnLogin_Submit.click();
	       // btnLogin_Submit.click();
	       
	       
	        Thread.sleep(2000);
	        
	        WebElement link_Posts=driver.findElement(By.linkText("Posts Management"));
		    link_Posts.click();
	        // Thoá hẳn Browser
		    
	        Thread.sleep(2000);
	        WebElement tagnameDiv=driver.findElement(By.tagName("div"));
		    tagnameDiv.getText();
		    System.out.println(tagnameDiv.getText());
	        
		    //WebElement btnDangBai=driver.findElement(By.cssSelector("[backg"));
		   // tagnameDiv.getText();
	        driver.quit();
	}
}
