package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	
	@BeforeSuite
	public void setUp() {
		
		driver = new FirefoxDriver();
		
		
	}
	
	@Test
	public void doLogin() throws InterruptedException {
		
		//Using EGit plugin
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.cssSelector("button[jsname = 'LgbsSe']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type = 'password']")).sendKeys("asdf");
		driver.findElement(By.cssSelector("button[jsname = 'LgbsSe']")).click();
		
		
	}
	
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
		
	}
	
}
