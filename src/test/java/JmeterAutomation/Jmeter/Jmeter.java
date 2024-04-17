package JmeterAutomation.Jmeter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jmeter {

	
	public static WebDriver driver;
	
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void TestData() throws InterruptedException 
	{
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Jmeter Testing");
		Thread.sleep(3000);
	}
	
	@After
	public void teardown()
	{
		if (driver != null) {
	        driver.quit();
		}
	}
}
