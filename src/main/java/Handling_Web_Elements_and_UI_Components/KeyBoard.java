package Handling_Web_Elements_and_UI_Components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://amazon.in");

			driver.manage().window().maximize();

			

			Actions a=new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click()
	.keyDown(Keys.SHIFT).sendKeys("pen driver").build().perform();

			Thread.sleep(2000);
			a.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();



		}


}
	

