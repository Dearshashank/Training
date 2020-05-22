package Training;

import java.time.Month;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign9A {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://alloyui.com/examples/datepicker/");
		driver.findElement(By.xpath("//button[contains(text(),'Select the date')]")).click();

		Thread.sleep(5000);
		WebElement prevMonth = driver.findElement(By.xpath("//*[@aria-label='Go to previous month']"));
		WebElement nextMonth = driver.findElement(By.xpath("//*[@aria-label='Go to next month']"));

		WebElement monthAndYear = driver.findElement(By.xpath("//*[@aria-role='heading']"));
		// String year =
		// (monthAndYear.getText()).substring((monthAndYear.getText()).length()
		// - 4);
		String monthName = (monthAndYear.getText()).substring(0, (monthAndYear.getText()).length() - 5);
		//System.out.println(monthName);
		String inputMonth = "August";
		String inputDate = "5";

		// To select the month
		if (Month.valueOf(inputMonth.toUpperCase()).getValue() > Month.valueOf(monthName.toUpperCase()).getValue()) {
			while (!monthName.equalsIgnoreCase(inputMonth)) {
				nextMonth.click();
				monthName = (monthAndYear.getText()).substring(0, (monthAndYear.getText()).length() - 5);
				Thread.sleep(3000);
			}
		} else if (Month.valueOf(inputMonth.toUpperCase()).getValue() < Month.valueOf(monthName.toUpperCase())
				.getValue()) {
			while (!monthName.equalsIgnoreCase(inputMonth)) {
				prevMonth.click();
				monthName = (monthAndYear.getText()).substring(0, (monthAndYear.getText()).length() - 5);
				Thread.sleep(3000);
			}
		}

		// To select the date
		List<WebElement> date = driver
				.findElements(By.xpath("//*[@class='yui3-calendar-row']/td[@aria-disabled='false']"));
		for (WebElement e : date) {
			if (e.isEnabled() && e.getText().equals(inputDate)) {
				e.click();
			}
		}
		driver.close();

	}

}