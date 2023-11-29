package headless;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login2 {

	WebDriver driver;
	
	@BeforeTest
	
	
	public void setUp() {
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("headless");
		co.setBinary("C:\\Users\\krishna.p\\Documents\\Eclipse\\Gecko\\geckodriver.exe");
		
		driver = new ChromeDriver(co);
		driver.get("https://beta2.moontechnolabs.com/golist/login");
		driver.manage().window().maximize();
	}
	@Test
	
	public void login() {
		driver.findElement(By.id("login-email")).sendKeys("admin@superadmin.com");
		driver.findElement(By.id("login-password")).sendKeys("123456789");
		driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-block waves-effect waves-float waves-light'])[1]")).click();
		
		
		
		
	}
	@AfterTest
	
	public void tearDown() {
		driver.quit();
	}
	

	
	

}
