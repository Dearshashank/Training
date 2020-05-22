package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign4 {
	WebDriver driver = null ;
	String showMessage ="" ;
	String getTotal= "";
	static String url ="https://www.seleniumeasy.com/test/basic-first-form-demo.html";
	
	// Creating Driver Connection
	public WebDriver CreateDriver(){
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return driver ;
	}
	
	// Navigate to the link 
	public void getLink(){
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	//Identify The Web Elements 
	public void Input(){
		driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("HELLO WORLD");
		driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("1010");
		driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("1010");
		
	}
	
	// To Enable Buttons 
	public void isEnabled(){
		driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();
	}
	
	// To get the output while pressing the Buttons
	public void isElementPresent(){
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement element ;
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='display']")));
		WebElement element2 ;
		element2= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='displayvalue']")));
	}
	
	// Closing WebDriver
	public void CloseDriver(){
		driver.close();
	}
	
	
	public static void main(String[] args) {
		Assign4 obj = new Assign4();
		obj.CreateDriver();
		obj.getLink();
		obj.Input();
		obj.isEnabled();
		obj.isElementPresent();
		obj.CloseDriver();
	}

}
