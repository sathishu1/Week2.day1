package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase3 {
	public static void main(String[] args) throws InterruptedException {

		// to setup the driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testee");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tony");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Tony1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Priya1");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Miss");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Sales");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100");
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industry1 = new Select(industry);
		industry1.selectByVisibleText("Aerospace");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source1 = new Select(source);
		source1.selectByVisibleText("Cold Call");
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownership1 = new Select(ownership);
		ownership1.selectByVisibleText("Partnership");
		WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select currency1 = new Select(currency);
		currency1.selectByVisibleText("BDT - Bangladesh Taka");
		WebElement campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select campaign1 = new Select(campaign);
		campaign1.selectByVisibleText("Car and Driver");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("2564");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Best Company");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("None");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("02/02/2022");

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("10");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("10");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("test2");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("test3");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600028");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("6000281");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("789987987897");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("tester4");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("test5");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("test 3 4");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state1 = new Select(state);
		state1.selectByVisibleText("Alaska");
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select country1 = new Select(country);
		country1.selectByVisibleText("Albania");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();

	}
}
