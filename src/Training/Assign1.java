package Training;

import java.io.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Assign1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// We ask the choice from user In which browser he want to open Google .
		
		System.out.println("Enter the choice which browser you want to open");
		System.out.println("1 Chrome \n2 Firefox \n3 InternetExplorer ");
		int choice = Integer.parseInt(br.readLine());
		WebDriver driver = null ;
		switch(choice) {
		
		case 1 : 
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
				driver = new ChromeDriver();
				break ;
		case 2 : 
				System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
				driver = new FirefoxDriver();
				break ;
		case 3 : 
				System.setProperty("webdriver.ie.driver","C:\\Program Files\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
				break ;
			
		default : System.out.println("Invalid Choice");
					return ;
		}
		driver.get("http://www.google.com");

	}

}
