package Training;

import java.io.File; 
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign3 {
	WebDriver driver = null ;
	static String url ="http://newtours.demoaut.com/mercuryregister.php";
	
	// Creating Driver Connection
	public WebDriver CreateDriver(){
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver ;
	}
	
	// Navigate to the link 
	public void VisitWebsite(){
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	//Identify The Web Elements 
	public void RegisterOnWebPage(){
			// UserName
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Shashank");
		
			// PassWord 
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Patel");
		
			// Phone 
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123456789");;
		
			// Email
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Shashank@gmail.com");
		    
		    // Address
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Navjyot Society");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Ahmedabad Gujrat");
			// City
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Ahmedabad");
		
			//state
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Gujrat");
		
			//postal code
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("380052");
		
			//Choose Country
	
		//	driver.findElement(By.xpath("//body//option[108]")); THIS IS NOT RECOMMENDED SO ANOTHER DYNAMIC APPROCH
		  
			WebElement we= driver.findElement(By.xpath("//select[@name='country']"));
			Select select = new Select ( we);
			select. selectByVisibleText("INDIA");
		
			//UserName 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("JoinShashank");
			
			//password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
		
			//Confirm PassWord
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("12345");
		
		}
	
	// Take ScreenShot
	public void TakeScreenShot(){
		
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scr, new File("Images\\screenshot.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// Closing WebDriver
	public void CloseDriver(){
		driver.close();
	}
	
	public static void main(String[] args) {
		Assign3 obj = new Assign3();
		WebDriver driver = obj.CreateDriver();
		obj.VisitWebsite();
		obj.RegisterOnWebPage();
		// Now we have to take screenshoots 
		obj.TakeScreenShot();
		System.out.println("ScreenShoot Captured");
		obj.CloseDriver();

	}

}
