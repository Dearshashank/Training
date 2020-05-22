package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {
	WebDriver driver = null ;
	static String url ="https://s1.demo.opensourcecms.com/wordpress/wp-login.php";
	
	// Creating Driver Connection
	public WebDriver CreateDriver(){
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver ;
	}
	
	// Navigate to the link 
	public void getLink(){
		driver.get(url);
	}
	
	//Identify The Web Elements 
	public void IdentifyWebElements(){
		try {
			// UserName Validate
		driver.findElement(By.id("user_login")).sendKeys("Identified");
		
			// PassWord Validate
		driver.findElement(By.id("user_pass")).sendKeys("Identified");
		
			// Remember me check box validate
		driver.findElement(By.id("rememberme")).click();
		
			// Submit button validate
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		
			// Lost Password Validate
		driver.findElement(By.xpath("//a[contains(text(),'Lost your password?')]")).click();
		
			// Visit OpenSourceCMS link validate
		driver.findElement(By.xpath("//a[contains(text(),'Back to opensourcecms')]")).click();
		
		Thread.sleep(5000);
		System.out.println("All the 6 WebComponents are Identified");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	// Closing WebDriver
	public void CloseDriver(){
		driver.close();
	}
	
	
	
	public static void main(String[] args) {
		Assign2 obj = new Assign2();
		WebDriver driver = obj.CreateDriver();
		obj.getLink();
		obj.IdentifyWebElements();
		// Now I am closing the drivers
		obj.CloseDriver();

	}

}
