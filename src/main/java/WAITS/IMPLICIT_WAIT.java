package WAITS;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

	public class IMPLICIT_WAIT {
	    public static void main(String[] args) 
	    {
	        WebDriver driver = new ChromeDriver();

	        // Set Implicit Wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("https://example.com");

	        // This will wait up to 10 seconds if element is not found immediately
	        driver.findElement(By.id("someElement")).click();

	        driver.quit();
	    }
	    
	}

	

