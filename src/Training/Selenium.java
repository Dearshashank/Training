package Training ;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Selenium {

   public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

         WebDriver driver = new ChromeDriver();

       driver.manage().window().maximize();

       driver.get("https://www.amazon.in/");
       
       Actions action = new Actions(driver); 
       
       WebElement element = driver.findElement(By.className("nav-input"));
//
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Amazon Pay");

//      action.contextClick(element).build().perform();
       WebElement ser = driver.findElement(By.className("nav-input"));
       String str = ser.getText();
//       System.out.print(str);
       ser.click();
       
   }

}