package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args)
	{
		//// open the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		// maximize the website
		driver.manage().window().maximize();
		// username 
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		//password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// click crm/sfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		// click on leads button
		driver.findElement(By.linkText("Leads")).click();
		// click on create lead button
		driver.findElement(By.linkText("Create Lead")).click();
		// enter company name 
	      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	      // enters first name 
	      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anjana");
	      // enter last name 
	      driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramalakshmi");
			// Select Source from dropdown
			
			WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
			
			Select dd = new Select(source);
			
			dd.selectByVisibleText("Conference");
			// Click on Create LEad button
	  		WebElement Marketing =driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	  		Select dd1 = new Select(Marketing);
	  		dd1.selectByVisibleText("Road and Track");
	  		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anjana");
	  		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Id");
	  		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium testing");
	  		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("32");

	  		WebElement PreferredCurrency =driver.findElement(By.id("createLeadForm_currencyUomId"));
	  		Select dd2= new Select( PreferredCurrency);
	  		dd2.selectByVisibleText("SOS - Somalian Shilling");
	  		
	  		WebElement Industry =driver.findElement(By.id("createLeadForm_industryEnumId"));
	  		Select dd3= new Select( Industry);
	  		dd3.selectByVisibleText("Computer Software");
	  		
	  		WebElement Ownership =driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	  		Select dd4= new Select( Ownership);
	  		dd4.selectByVisibleText("LLC/LLP");
	  		
	  		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Ramalakshmi");
	  		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	  		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("200");
	  		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("truth");
	  		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testleaf description");
	  		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("noted");
	  		//contact information
	  		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600126");
	  		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8220009600");
	  		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
	  	    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Anjanag");
	  	    //driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anjanaramalakshmi@gmail.com");
	  	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
	  	    //primary address
	  	    
	  	    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Plot no 1A");
	  	    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Mithra Nivas");
	  	    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Bala garden extension");
	  	    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Noothencheri");
	  	    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
	  	   driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600126");
	  	  driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Kanchipuram district");
		    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600126");
		    WebElement State =driver.findElement(By.id("createLeadFidorm_ownershipEnumIdcreateLeadForm_generalStateProvinceGeoId"));
			Select dd5= new Select( State);
			dd5.selectByVisibleText("Arizona");
	  	    WebElement Country =driver.findElement(By.id("createLeadFidorm_ownershipEnumIdcreateLeadForm_generalcountryProvinceGeoId"));
			Select dd6= new Select( Country);
			dd6.selectByVisibleText("Arizona");
	  	    // click create lead button
	  		driver.findElement(By.linkText("submitButton")).click();
	  		// Close the BRowser
	  		driver.close();

	  		
		

	}

}
