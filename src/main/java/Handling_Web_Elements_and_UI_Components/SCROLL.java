package Handling_Web_Elements_and_UI_Components;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SCROLL {

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/scroll/");

		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,1000)");

	}

}
