package WAITS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EXPLICIT_WAIT 
{

	public static void main(String[] args) 
	{
       
		 WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        // Explicit Wait with WebDriverWait
        WebDriverWait wait = new WebDriverWait (driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("someElement")));

        element.click();

        driver.quit();
    }
	
}
