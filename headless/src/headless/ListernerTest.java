package headless;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ListernerTest implements ITestListener {
	
	WebDriver driver;
	
	
	
	
	@BeforeTest
	
	
	public void setUp() throws IOException {
		ChromeOptions co = new ChromeOptions();
		// co.addArguments("headless");
		co.setBinary("C:\\Users\\krishna.p\\Documents\\Eclipse\\Gecko\\geckodriver.exe");
		
		driver = new ChromeDriver(co);
		driver.get("https://beta2.moontechnolabs.com/golist/login");
		driver.manage().window().maximize();
		
    
		
    	
	}
	
	@Test(priority=1)
	
	public void Wrongcrediantials() throws IOException {
		
		
		driver.findElement(By.id("login-email")).sendKeys("admin@superadmin.com");
		driver.findElement(By.id("login-password")).sendKeys("123456789");
		driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-block waves-effect waves-float waves-light'])[1]")).click();
		
				
	}
	
	@Test(priority=2)
	
	public void Wrongcrediantials1() throws IOException {
		
		
		driver.findElement(By.id("login-email")).sendKeys("admin@uperadmin.com");
		driver.findElement(By.id("login-password")).sendKeys("12345678");
		driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-block waves-effect waves-float waves-light'])[1]")).click();
		
				
	}
	
	@Test(priority=3)
	
	public void login(){
		
	
		driver.findElement(By.id("login-email")).sendKeys("admin@superadmin.com");
		driver.findElement(By.id("login-password")).sendKeys("12345678");
		driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-block waves-effect waves-float waves-light'])[1]")).click();
	
				
	}
	
	

	@AfterTest
	
	public void tearDown()  {
	
		driver.quit();
		
	}
	

}
