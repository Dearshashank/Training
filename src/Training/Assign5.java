package Training;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5 {
	WebDriver driver = null ;
    static String url ="https://s1.demo.opensourcecms.com/wordpress/";
	
	// Creating Driver Connection
	public WebDriver CreateDriver(){
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver ;
	}
	
	// Navigate to the link 
	public void getLink(){
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	//Identify The links on Website
	public int LinkCount(){
		 List<WebElement> links = driver.findElements(By.xpath("//a")); 
         int n = links.size(); 
         return n ;
	}
	
	// Closing WebDriver
	public void CloseDriver(){
		driver.close();
	}
	
	
	public static void main(String[] args) {
		Assign5 obj = new Assign5();
		obj.CreateDriver();
		obj.getLink();
		int count=obj.LinkCount();
		System.out.println(count);
		obj.CloseDriver();
	}

}
