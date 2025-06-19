package Handling_Web_Elements_and_UI_Components;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vertically_Horizontally {

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/scroll/");

		driver.manage().window().maximize();
		//full webpage scroll
		JavascriptExecutor js=(JavascriptExecutor)driver;

		

		Thread.sleep(2000);

		

		js.executeScript("window.scroll(0,3050)");

		

		//scroll table vertically

		Thread.sleep(2000);

		js.executeScript("document.querySelector(\"div[style$='position: relative; overflow: auto; max-height: 200px; width: 100%;']\").scrollTop=300");

		

		//scroll table horizontally

		Thread.sleep(2000);

		js.executeScript("document.querySelector(\"div[style$='position: relative; overflow: auto; width: 100%;']\").scrollLeft=300");
		
		

	}

}
