package Bai8;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Initialization.*;
public class Radiobutton extends Init {
	public static void main(String[] args) throws InterruptedException 
	//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/label[1]/input[1]
	{
		Setup();
		driver.navigate().to("https://demo.anhtester.com/basic-radiobutton-demo.html");
		WebElement RdbuttonMale =	driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/label[1]/input[1]"));
		WebElement RdbuttonFeMale =	driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/label[2]/input[1]"));
		
		if(RdbuttonMale.isSelected()==false)
		{
			Thread.sleep(2000);
			RdbuttonMale.click();
			Thread.sleep(2000);
			System.out.println(" MỚi Chọn ròi đó");
			if(RdbuttonFeMale.isSelected()==false)
			{
				RdbuttonFeMale.click();
				System.out.println(" MỚi Chọn Female ròi đó");
				
			}
		}
		else
		{
			System.out.println("Chọn ròi đó");
			
		}
		
		// Group Radio button
		
		WebElement RdButton5to10 =	driver.findElement(By.xpath("//input[@value='5 - 15']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RdButton5to10);
		
		RdButton5to10.click();
		
		WebElement button_Getvalues =	driver.findElement(By.xpath("//button[normalize-space()='Get values']"));
		button_Getvalues.click();
		
		WebElement text_age_values =	driver.findElement(By.xpath("//p[@class='groupradiobutton']"));
		System.out.println(text_age_values.getText());
		// So sánh chứa??????????
		if(text_age_values.getText().contains("Age group: 5 - 15"))
		{
			System.out.println("Chọn ròi đó, thằng 5 tới 15");
		}
		button_Getvalues.click();
		
		
		
		
		
		TearDown();
	}
}
