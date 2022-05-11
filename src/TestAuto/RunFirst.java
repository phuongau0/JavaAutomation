package TestAuto;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class RunFirst {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\Java\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		   
	        //1 - Maximize browser của mình
	        driver.manage().window().maximize();

	        //2 - Đi đến 1 url
	        
	        driver.navigate().to("https://anhtester.com");
	        

	        //3 - Lấy Title và in ra console
	        
	        System.out.println(driver.getTitle());

	        Thread.sleep(2000);
	        // Thoát hẳn Browser

	        driver.quit();
	}

}
