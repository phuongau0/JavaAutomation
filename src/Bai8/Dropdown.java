package Bai8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Initialization.*;
public class Dropdown extends Init  {
	public static void main(String[] args) throws InterruptedException 
	{
		Setup();
		
		driver.navigate().to("https://demo.anhtester.com/basic-select-dropdown-demo.html");
		Thread.sleep(1000);
		
		// Handle Dropdown tĩnh
		WebElement element=driver.findElement(By.xpath("//select[@id='select-demo']"));
		//-> Khai báo đối tượng kiểu Select cho element trên
		Select selectSimple=new Select(element);
		
		// Lấy value
		selectSimple.selectByIndex(2);
	//	selectSimple.selectByValue("Sunday");
	//	selectSimple.deselectByVisibleText("Sunday");
		
		
		//Kiểm tra có phải dạng Multi Select ko
		if(selectSimple.isMultiple()==true)
		{
			System.out.print("Yes");
		}
		Thread.sleep(1000);
		
		System.out.println(selectSimple.getOptions().size());
	//	System.out.println(selectSimple.getFirstSelectedOption().getText());
		
		List <WebElement> getAllOption=selectSimple.getOptions();
		
	//	ArrayList <WebElement> getAllOption2ArrayList=selectSimple.getOptions();
		
		for(int i=0;i<getAllOption.size();i++)
			{
			//System.out.println(getAllOption.get(i).getAttribute("value"));
			System.out.println(getAllOption.get(i).getText());​
			}
		
		Thread.sleep(1000);
		TearDown();
	}

}
