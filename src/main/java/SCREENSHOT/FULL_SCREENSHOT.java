package SCREENSHOT;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FULL_SCREENSHOT 
{

	
public static void main(String[] args) throws IOException 
	
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in");

		driver.manage().window().maximize();

		

		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	Files.copy(f,new File("C:\\Users\\parag\\Downloads\\sample\\amazonscreenshot.jpg"));
		Files.copy(f,new File("C:\\Users\\preet\\Downloads\\amazonscreenshot.jpg"));


		
		
	}

}
