package MainPage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrontPage {

	public static void main(String[] args) throws InterruptedException 
	{
		
		 WebDriver driver = new ChromeDriver();

		  driver.get("https://www.flipkart.com");
	      driver.manage().window().maximize();	
	       
		
	      // Search for a product
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("iPhone 14");
	        searchBox.submit();  
	        
	        //  Click on first product
	        WebElement firstProduct = driver.findElement(By.xpath("//div[normalize-space()='Apple iPhone 14 (Midnight, 256 GB)']"));
	        firstProduct.click();
	        
	        
	     //  Print product price
	/*        WebElement price = driver.findElement(By.xpath("//div[@class='Nx9bqj CxhGGd']"));
	        System.out.println("Product Price: " + price.getText());  */
	        
	       //Window Handling
	     // 5. Switch to new window/tab
	        String mainWindow = driver.getWindowHandle(); // stores main window

	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) 
	        {
	            if (!window.equals(mainWindow)) 
	            {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	        
	    //    Thread.sleep(3000); // Wait for results to load
	        
	        driver.close(); // closes the product tab
	        driver.switchTo().window(mainWindow); // switches back to original window
         
	        

	}

}
