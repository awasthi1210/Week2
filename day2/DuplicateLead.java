package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorAssignment3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main"); // Launch URL
		driver.manage().window().maximize();
		// Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click(); // Click on CRM/SFA Link
		
		driver.findElement(By.linkText("Leads")).click(); // Click on Leads Button
		
		driver.findElement(By.linkText("Create Lead")).click(); // Click on Create Lead
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Thinksys Pvt Ltd"); // Company Name using id
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mona"); // First Name using id
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Awasthi"); // last name using id
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("manvi"); // Enter first name local
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT"); // Enter department name
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("All the information is correct"); //Description
																											
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("monaparashar1229@gmail.com"); //Email by id
		
		//Select state as New York
		new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"))).selectByVisibleText("New York");

		// drop down by send keys:
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Direct Mail");
		
		// Select by Index:
		WebElement marketingCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketing = new Select(marketingCamp);
		marketing.selectByIndex(2);
		
		// select by visibleText:
		WebElement industryElement = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industry = new Select(industryElement);
		industry.selectByVisibleText("Insurance");
		
		// Select by Value
		WebElement ownervalue = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select owner = new Select(ownervalue);
		owner.selectByValue("OWN_SCORP");

		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		

	}
}

