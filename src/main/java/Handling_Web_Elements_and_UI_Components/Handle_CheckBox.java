package Handling_Web_Elements_and_UI_Components;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_CheckBox 
{

	
public static void main(String[] args) throws InterruptedException 
	
	{
		
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.irctc.co.in/nget/train-search");
	 
	 Thread.sleep(1000);

		driver.manage().window().maximize();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@class='ng-tns-c58-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[contains(text(),'PUNE JN - PUNE')]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("(//input[@class='ng-tns-c58-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted'])[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[normalize-space()='NAGPUR - NGP']")).click();

		Thread.sleep(1000);

		//driver.findElement(By.xpath("//div[@class='ng-tns-c66-12 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();

		//Thread.sleep(1000);

		//driver.findElement(By.xpath("//span[normalize-space()='TATKAL']")).click();

		//Thread.sleep(1000);

		

		List<WebElement> l=driver.findElements(By.xpath("//div[@class='col-xs-12 remove-padding']//div[@class='col-xs-12 remove-padding']"));

		

		int a=5;

		display();

		

		for(WebElement i:l)

		{

			System.out.println(i.getText());

		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[@for='concessionBooking']")).click();

		Thread.sleep(2000);

		

		driver.findElement(By.xpath("//span[@class='ui-button-text ui-clickable']")).click();

		

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		//driver.switchTo().alert().accept();



	}

	

	static void display()

	{

		System.out.println("Showing Checkboxes");

	}
	 
	
	}
	

