package Training;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign9 {

	WebDriver driver =null;
	String URL ="https://alloyui.com/examples/datepicker/";
	
	public WebDriver CreateDriver(){
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public void getLink(){
		driver.get(URL);
	}
	public void Selectthedate(){
		driver.findElement(By.xpath("//button[contains(text(),'Select the date')]")).click();
	}
	
	public void SelectDate(String date){
		Date curr = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date ex;

		try {
		ex = dateFormat.parse(date);
		String day = new SimpleDateFormat("dd").format(ex);
		String month = new SimpleDateFormat("MMMM").format(ex);
		String year =new SimpleDateFormat("yyyy").format(ex);
		System.out.println(day+" "+month+" "+year);

		   String MandY = month+" "+year ;
		   
//		    String displayDate =driver.findElement(By.xpath("//*[@id='calendaryui_patched_v3_18_1_1_1587975004814_162_header']")).getText();
		 
		   // I am facing Issue here unable to get the text of current "April 2020" from calender
		   // NOT a single validation technique is working here ? i dont know why
//		    String disdate1 = driver.findElement(By.className("yui3-u yui3-calendar-header-label")).getText();
//		    String disdate2 = driver.findElement(By.xpath("//*[@id='calendaryui_patched_v3_18_1_1_1587977716299_162_header']")).getText();
//		    String disdate3 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[1]/div")).getText();
//		    String disdate4 = driver.findElement(By.xpath("//div[@id='calendaryui_patched_v3_18_1_1_1587977716299_162_header']")).getText();
//		    String disdate5 = driver.findElement(By.id("calendaryui_patched_v3_18_1_1_1587977716299_162_header")).getText();
//		    String disdate6 = driver.findElement(By.cssSelector("#calendaryui_patched_v3_18_1_1_1587977716299_162_header")).getText();
		    String disdate7 =  driver.findElement(By.xpath("//a[@role='button' and @aria-label='Go to previous month']/following-sibling::div")).getText();
		 
		                      // Please Comment it out rest and check for the locator through print statement
		    System.out.println("****I want to display that here********"+disdate7);
		   

		} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws ParseException {
		Assign9 obj = new Assign9();
		obj.CreateDriver();
		obj.getLink();
		obj.Selectthedate();
		obj.SelectDate("05/08/2020");

	}

}