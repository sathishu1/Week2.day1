package week2day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Testcase2 {
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
		driver.findElement(By.partialLinkText("Find Contacts")).click();
		driver.findElement(By.partialLinkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("tested@gmail.com");
	    driver.findElement(By.xpath("//button[@id='ext-gen212']")).click();
driver.close();
}
}
