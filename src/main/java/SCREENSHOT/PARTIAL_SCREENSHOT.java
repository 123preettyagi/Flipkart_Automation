package SCREENSHOT;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class PARTIAL_SCREENSHOT {

	public static void main(String[] args) throws IOException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");

		driver.manage().window().maximize();

		

		//full screen screenshot

		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		

		Files.copy(f,new File("C:\\Users\\preet\\Downloads\\box.jpg"));

		

		//partial screen screenshot   Selenium 4 New Feature

		WebElement w1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		w1.click();

		w1.sendKeys("pen drive");

		File f1=w1.getScreenshotAs(OutputType.FILE);

		Files.copy(f1,new File("C:\\Users\\preet\\Downloads\\box.jpg"));



		//another partial screenshot

		WebElement w2=driver.findElement(By.xpath("(//div[@class='a-cardui fluid-fat-image-link fluid-card fluid-fat-image-link'])[1]"));

		File f2=w2.getScreenshotAs(OutputType.FILE);

		Files.copy(f2,new File("C:\\Users\\preet\\Downloads\\box.jpg"));

		

		driver.quit();



	}

}
