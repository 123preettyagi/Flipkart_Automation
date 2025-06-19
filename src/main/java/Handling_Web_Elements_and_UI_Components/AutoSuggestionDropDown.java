package Handling_Web_Elements_and_UI_Components;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDown 
{

	
public static void main(String[] args) throws InterruptedException 
	
	{
	
	 WebDriver driver = new ChromeDriver();
	driver.get("https://www.goibibo.com/");

	driver.manage().window().maximize();

	

	//click on From

	Thread.sleep(1000);

	driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();

	

	//type pune in From

	Thread.sleep(1000);

	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pune");

	

	//select pune

	Thread.sleep(1000);

	driver.findElement(By.xpath("//span[normalize-space()='(PNQ)']")).click();

	

	//type nagpur

	Thread.sleep(1000);

	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nagpur");

	

	//select nagpur

	Thread.sleep(1000);

	driver.findElement(By.xpath("//span[text()='Nagpur, India']")).click();

	

	//click date Done

	Thread.sleep(1000);

	driver.findElement(By.xpath("//span[text()='Done']")).click();

	

	//choose adult Done

	Thread.sleep(1000);

	driver.findElement(By.xpath("//a[text()='Done']")).click();

	

	//print radio button

	Thread.sleep(1000);

	

	List<WebElement> l=driver.findElements(By.xpath("//ul[@class='sc-iqseJM giZLuO']"));

	

	for(WebElement i: l)

	{

		System.out.println(i.getText());

	}

	

	//select student radio button

	Thread.sleep(1000);

	driver.findElement(By.xpath("//span[text()='student']")).click();

	

	//selecting adult Done button

	Thread.sleep(1000);

	driver.findElement(By.xpath("//a[text()='Done']")).click();

	

	//click search button

	Thread.sleep(1000);

	driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();



}
	
	}
	

