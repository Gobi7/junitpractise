package JunitPractice;

import java.awt.Dimension;
import java.awt.Point;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("https://www.google.com");
	driver.manage().window().maximize();
	List<WebElement> x = driver.findElements(By.tagName("a"));
	System.out.println(x.size());
	for(WebElement x1 : x)
	{
	System.out.println(x1.getAttribute("href"));
	}
	 
}
}
