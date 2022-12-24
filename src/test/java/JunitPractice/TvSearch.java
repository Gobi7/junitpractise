package JunitPractice;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TvSearch {
	static WebDriver driver;
	long startTime;
	long endTime;
	@BeforeClass
	public static void launch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@AfterClass
	public static void close() {
		
		//driver.quit();
	}
	@Before
	public void startTime() {
		 startTime = System.currentTimeMillis();
		
	}
	@After
	public void endTime() {
		 endTime = System.currentTimeMillis();
		 System.out.println("total time taken:"+(endTime-startTime));
		}
	
	
	@Test
	public void test1() {
		try {
			WebElement closeic = driver.findElement(By.xpath("//button[@ class='_2KpZ6l _2doB4z']"));
			 closeic.isDisplayed();
			 closeic.click();
			
			
			
		} catch (Exception e) {
			System.out.println("login not required");
			
		}
	}
	 static String fn;
		@Test
		public void test2() {
			driver.findElement(By.name("q")).sendKeys("MICROMAX TV",Keys.ENTER);
//			WebElement mobile = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]"));
//			fn = mobile.getText();
//			System.out.println("mobile name is:"+fn);
//			mobile.click();
//			
		}
		

}
