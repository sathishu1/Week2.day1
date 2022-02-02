package week2day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {
public static void main(String[] args) throws InterruptedException  {
		
		//to setup the driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();	
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Tony");
		driver.findElement(By.id("lastNameField")).sendKeys("Priya");
		driver.findElement(By.name("submitButton")).click();
	
		String firstname= driver.findElement(By.id("viewContact_fullName_sp")).getText();
		String title=driver.getTitle();

		System.out.println("Firstname:"+firstname);
		System.out.println("Title of page:"+title);
		driver.close();


}
}
