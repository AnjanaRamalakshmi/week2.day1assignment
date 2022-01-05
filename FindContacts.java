package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContacts {

	public static void main(String[] args)
	{
		// open the browser
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
		// click contact tab
		driver.findElement(By.linkText("Contacts")).click();
		// click find contacts tab
		driver.findElement(By.linkText("Find Contacts")).click();
		
		// click email tab
		driver.findElement(By.xpath("//*[@id=\"ext-gen160\"]")).click();
		
		// type email id as babu@testleaf.com
		driver.findElement(By.xpath("//*[@id=\"ext-gen41\"]")).click();
		// click submit button
		//driver.findElement(By.name("submitButton")).click();
		// type in email address text box
		driver.findElement(By.xpath("//*[@id=\"ext-gen160\"]")).sendKeys("babu@testleaf.com");
		// click the find contacts button
		driver.findElement(By.className("Find Contacts")).click();
		// close the browser
		driver.close();
		
		
	}

}
