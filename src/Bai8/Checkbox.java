package Bai8;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Initialization.*;
public class Checkbox extends Init {
//	Init init=new Init();
	
	public static void main(String[] args) throws InterruptedException 
	{
		Setup();
	  //  driver.navigate().to("https://demo.anhtester.com/basic-checkbox-demo.html");
		driver.navigate().to("https://demo.anhtester.com/basic-checkbox-demo.html");
		//Kiểm tra check box đã được check hay chưa
		Boolean isSelected = driver.findElement(By.id("isAgeSelected")).isSelected();

		//Nếu chưa được check thì click vào ô check box đó
		if(isSelected == false)
		{ 
		//	Thread.sleep(2000);
		   driver.findElement(By.id("isAgeSelected")).click();
		//   Thread.sleep(2000);
		}
		
		// 1. KIểm tra hiển thị CheckAll
		
		Thread.sleep(500); 
	WebElement textCheckAll=	driver.findElement(By.xpath("//input[@id='check1']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", textCheckAll);
	//WebElement t1=	driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[1]/label[1]/input[1]"));
	
	Thread.sleep(2000); 
	System.out.print(textCheckAll.getText());
	//textCheckAll.click();
	if(textCheckAll.getAttribute("value").equals("Check All") )
	{
		Thread.sleep(2000);
		textCheckAll.click();
		Thread.sleep(2000);
		System.out.println("Rồi");
	}
	
	
	else
	{
		System.out.print("Lỗi");
	}
		// Kiểm tra được chọn hết
	/*WebElement t1=	driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[1]/label[1]/input[1]"));
	WebElement t2=	driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[2]/label[1]/input[1]"));
	WebElement t3=	driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[3]/label[1]/input[1]"));
	WebElement t4=	driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[4]/label[1]/input[1]"));
	
	//----------------CÁCH 1-------------------------------------------
	if(t1.isSelected() ==true && t2.isSelected() ==true && t3.isSelected() ==true && t4.isSelected() ==true)
	{
		System.out.print("oke");
	}

	} */
	
	
	//------------------------------------------------------
	
	var Listcheckbox=driver.findElements(By.xpath("//body/div[@id='easycont']/div[@class='row']/div[@class='col-md-6 text-left']/div[2]/div[2]/div[@class='checkbox']"));
	System.out.println("số lượng của check box" +Listcheckbox.size());
	
	for(int i=0;i<Listcheckbox.size();i++)
	{
		WebElement t1=	driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div["+1+"]/label[1]/input[1]"));
		if(t1.isSelected()==true)
		{
			System.out.println("Check box" + (i+1)+ "Đã được chọn");
		}
		else
		{
			System.out.println("Check box" + (i+1)+ "chưa được chọn");
		}
	}
	
	
		//Kiểm tra sau khi chọn, text la UnCheckAll
		
		//driver.findElement(By.id("check1")).click();
		//for(int )
	WebElement textUnCheckAll=	driver.findElement(By.xpath("//input[@id='check1']"));
	System.out.println(textUnCheckAll.getAttribute("value"));
	if(textUnCheckAll.getAttribute("value").toString().equals("Uncheck All"))
	{
	//	Thread.sleep(2000);

	//	Thread.sleep(2000);
		System.out.print("Rồi nha");
	//	textUnCheckAll.click();
		Thread.sleep(2000);

	}
	else
	{
		System.out.print("sai nha");
	}
	TearDown();

	}
}
