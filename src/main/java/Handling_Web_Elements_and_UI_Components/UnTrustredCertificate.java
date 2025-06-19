package Handling_Web_Elements_and_UI_Components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UnTrustredCertificate {

	public static void main(String[] args) 
	{
	
		ChromeOptions options=new ChromeOptions();

		//FirefoxOptions options=new FirefoxOptions();

		//EdgeOptions options=new EdgeOptions();
	

		options.setAcceptInsecureCerts(true);	
		 WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();


	}

}
