package Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Frame {

	public static void main(String[] args) 
	
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");

		driver.manage().window().maximize();

		

		List<WebElement> l=driver.findElements(By.tagName("iframe"));

		

		System.out.println("No. of frames in webpage="+l.size());



	}

}
