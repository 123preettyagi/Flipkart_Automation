package WAITS;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Function;

public class FluentWait {

	public static void main(String[] args) 
	{
	
		
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        // Fluent Wait configuration
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))        // Max wait time
                .pollingEvery(Duration.ofSeconds(2))        // Check every 2 seconds
                .ignoring(NoSuchElementException.class);    // Ignore if element not found

        // Wait for element
        WebElement element = wait.until(new Function<WebDriver, WebElement>() 
        {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("someElement"));
            }
        });

        element.click();

        driver.quit();

	}

}
