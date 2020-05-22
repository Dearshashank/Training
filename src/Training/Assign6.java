package Training;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assign6{
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/signup");
	String title1 = driver.getTitle();
	String title2 =null;
	String parent = driver.getWindowHandle();
	
	driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
	
	Set<String> windows = driver.getWindowHandles();
	for(String child : windows){
		if(!child.equals(parent)){
			driver.switchTo().window(child);
			title2  = driver.getTitle() ;
		}
	}
	System.out.println("Parent window title :"+ title1);
	System.out.println("Child window title :"+ title2);
	if(title1==title2){
		System.out.println("Result :Both are same");
	}else{
		System.out.println("Result :Both are different");
	}
}
}