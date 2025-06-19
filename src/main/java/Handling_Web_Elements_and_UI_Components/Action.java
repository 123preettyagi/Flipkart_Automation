package Handling_Web_Elements_and_UI_Components;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Action 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		 WebDriver driver = new ChromeDriver();

	//	  driver.get("https://omayo.blogspot.com/");
	  //    driver.manage().window().maximize();
	      
	      //Alert 
	  //    driver.findElement(By.id("alert1")).click();
	      
	  //    Alert alert=driver.switchTo().alert();
	 //    alert.accept();  
	    //  alert.dismiss();
	    //  alert.getText();
	     
	   //ENTER IN THE TEXT FIELD   
	/*    WebElement wb=driver.findElement(By.name("q"));
	    wb.sendKeys("Jio");
	    WebElement wb1=driver.findElement(By.xpath("//input[@value='Search']"));
	    wb1.click();  */
	    
	    // RADIO BUTTON
	   /*   WebElement wb=driver.findElement(By.name("radio2")); 
	      wb.click(); */
	    
	      // CHECKBOX
	   /*   WebElement wb=driver.findElement(By.name("radio2")); 
	      wb.click();  */
	      
	/*      WebElement wb=driver.findElement(By.id("prompt")); 
	      wb.click(); 
	      Thread.sleep(3000);
	      wb.sendKeys("Jio"); */
	    
	      
	      // UPLOAD FILE
	   /*   WebElement wb=driver.findElement(By.id("uploadfile"));
	      wb.sendKeys("C://Users//preet//Downloads//Critical-Advisory-I.pdf"); */
	      
	    // DOWNLOAD FILE
	      
	/*	 ChromeOptions options=new ChromeOptions();
		 
		 HashMap<String,Object> chrompref=new HashMap<String,Object>();
		 
		 String downloadpath=System.getProperty("user.dir");
		 chrompref.put("download.default_directory", downloadpath);
		 options.setExperimentalOption("prefs", chrompref);
		 
		 
		 driver.get("https://omayo.blogspot.com/p/page7.html");
		 driver.findElement(By.linkText("ZIP file")).click();
		 Thread.sleep(5000);
		 
		 File file=new File(downloadpath+"\\DownloadDemo-master.zip");
		 
		 if(file.exists())
		 {
			System.out.println("File download sucessfully"); 
		 }
		 else
		 {
			 System.out.println("File not download ");
		 }   */
		 
		 
		// SELECT OPTIONS 
	/*      WebElement dropdownElement = driver.findElement(By.id("drop1"));
	      Select dropdown = new Select(dropdownElement);
	      
	   // Select by visible text
	      dropdown.selectByVisibleText("doc 1");

	      // Select by value
	      dropdown.selectByValue("doc 1");

	      // Select by index
	      dropdown.selectByIndex(2);  */
	      
	      
	      

	 // MOUSE HOVER
	/*   WebElement elementToHover = driver.findElement(By.linkText("Page One"));

	   Actions actions = new Actions(driver);
	   actions.moveToElement(elementToHover).perform(); */
		 
	      
	   // DRAG AND DROP   
	      driver.get("https://jqueryui.com/droppable/");
			driver.manage().window().maximize();
			Actions a=new Actions(driver);
			WebElement w=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			driver.switchTo().frame(w);
a.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), 
driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();





	      
	      
	}
		
	
}
