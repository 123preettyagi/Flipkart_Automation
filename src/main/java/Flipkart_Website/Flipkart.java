package Flipkart_Website;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		
		Actions a=new Actions(driver);
a.moveToElement(driver.findElement(By.xpath("//div[@aria-label='Electronics']//div//span[@class='_1XjE3T']")))
.build().perform();
		
a.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Bluetooth Headphones']")))
.click().build().perform();
		
a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Aroma NB121 Almaty Upto 40H Playtime* Fast Chargin')]")))
.click().build().perform();



File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	Files.copy(f,new File("C:\\Users\\parag\\Downloads\\sample\\amazonscreenshot.jpg"));
	Files.copy(f,new File("C:\\Users\\preet\\Downloads\\amazonscreenshot.jpg"));
	System.out.println("screenshot saved sucessfully");

JavascriptExecutor js=(JavascriptExecutor)driver;
Thread.sleep(2000);
js.executeScript("window.scroll(0,1000)");

	/*	WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("iphone 15 pro max");
		searchBox.submit();
		
		String mainPage = driver.getWindowHandle();
		System.out.println("Main page="+ mainPage);
		
driver.findElement(By.xpath("//div[normalize-space()='Apple iPhone 15 Pro Max (Blue Titanium, 256 GB)']")).click();

Set<String> allPages=driver.getWindowHandles();
for(String page : allPages) 
  {
	if(!page.equals(mainPage)) 
	{
		driver.switchTo().window(page);
		break;
	}
  }

System.out.println(driver.getCurrentUrl());
  

*/


// ADD TO CART
/* 
List<WebElement> products= driver.findElements(By.className("_21Ahn-"));
System.out.println(products.size());

for(WebElement product: products) 
{ System.out.println(product.getText()); }

driver.findElement(By.xpath("//a[@class='_9Wy27C']")).click();		
*/

// HOVER 
/* 
Actions a=new Actions(driver);

a.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Home & Furniture']"))).build().perform();
*/



		
	}

}
