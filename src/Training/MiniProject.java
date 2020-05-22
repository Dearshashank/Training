package Training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;  

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MiniProject {

	public static void main(String[] args){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		//Login functionality
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@class='btn_action']")).click();
		
		
		// Find the no of items which we can add to cart
  		List<WebElement> links = driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]"));
		int products = links.size();
		
  		String[] arr = new String[products] ;
  		// Approch to tick and save all the checked product in a Array
  		ArrayList<String> list = new ArrayList<>();
//  		list.add("as");
  		
  		int j=0 ;
		for(int i =1 ;i<=products ;i++){	
		list.add(driver.findElement(By.xpath("//*[@id='item_"+j+"_title_link']/div")).getText());
		j++;
		}
	    ArrayList<String> newList = list;
		Collections.sort(newList);

		//Assert.assertEquals(list ,newList);
		System.out.println("Verify Sorting Mechanism");	
	}
}
