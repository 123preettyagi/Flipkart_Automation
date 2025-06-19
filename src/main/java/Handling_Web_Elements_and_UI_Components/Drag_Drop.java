package Handling_Web_Elements_and_UI_Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop 

{

	public static void main(String[] args) throws InterruptedException
	{
		
		 WebDriver driver = new ChromeDriver();	
		
		 driver.get("https://jqueryui.com/droppable/");

			driver.manage().window().maximize();
			Actions a=new Actions(driver);
			WebElement w=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			driver.switchTo().frame(w);
			a.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
		 
		 
	}
	
	
	
}
