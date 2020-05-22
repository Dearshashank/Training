package Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://www.google.com/recaptcha/api2/demo";
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of iframes Detected "+iframes.size());
		
		driver.switchTo().frame(0) ;
		System.out.println("Switched to first frame.");
		driver.findElement(By.className("recaptcha-checkbox-border")).click();
		System.out.println("Captcha Detected");
	}

}
