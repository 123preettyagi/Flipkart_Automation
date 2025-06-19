package Flipkart_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MYNTRA {

	public static void main(String[] args) 
	{
	
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		

		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[@aria-label='Electronics']//div//span[@class='_1XjE3T']")))
		.build().perform();

	}

}
