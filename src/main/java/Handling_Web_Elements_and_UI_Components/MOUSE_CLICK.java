package Handling_Web_Elements_and_UI_Components;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOUSE_CLICK 
{


	public static void main(String[] args) throws InterruptedException
	{
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://amazon.in");

			

			driver.manage().window().maximize();

			

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			

			Actions a=new Actions(driver);

			

			a.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"))).build().perform();

			

			a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"))).click().build().perform();

			

			driver.navigate().back();

			

			a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().sendKeys("pen driver").doubleClick().build().perform();



			//a.doubleClick(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")));

			

			//a.moveToElement(driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']"))).contextClick().build().perform();

			a.contextClick(driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']"))).build().perform();

			

			

		}
	}
	
	

