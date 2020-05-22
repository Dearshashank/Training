package Training;
/*
1) Launch new Browser
2) Open URL “http://toolsqa.com/automation-practice-switch-windows/”
3) Click on the Button “Timing Alert”
4) Accept the Alert (Alert will take 3 second to get displayed, Use WebDriverWait to wait for it)
*/

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiting {

public static void main(String[] args) {
	
	String url = "http://toolsqa.com/automation-practice-switch-windows/";
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//1, 2
	driver.get(url);
	
	//3
//	driver.findElement(By.id("timingAlert")).click();
//	System.out.println("Timer JavaScript Alert is triggered but it is not yet opened");
	
	//4
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	Alert myalert = wait.until(ExpectedConditions.alertIsPresent());
//	System.out.println("Either Pop Up is displayed or it is Timed Out");
//	myalert.accept();
//	System.out.println("Alert Accepted");
	
	driver.close();
}

}
