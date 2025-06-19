package Data_Driven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DATA_DRIVEEN 
{

	public static WebDriver driver;
	public static SoftAssert sft=new SoftAssert();
	
	@Test(dataprovider="getdata")
	
	public void login()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	
}
