package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SWITCHING_FRAMES {

	public static void main(String[] args) 
	{
	
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");

			driver.manage().window().maximize();

			

			WebElement w=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));

			

			driver.switchTo().frame(w);

			

			//click try button

			driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();

			

			driver.switchTo().alert().accept();

			//driver.switchTo().alert().dismiss();

			

			driver.switchTo().defaultContent();

			

			driver.findElement(By.xpath("//a[@id='getwebsitebtn']")).click();

			



		}


	}

