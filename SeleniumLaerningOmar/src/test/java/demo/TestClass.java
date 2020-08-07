package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import lib.Utility;

public class TestClass
{

	WebDriver driver;
	
	@Test
	public void test1() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver_84.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement element=driver.findElement(By.id("hplogo"));
//		Utility.captureFullpageScreenshot(driver, "ScreenshotFullpage");
		Utility.captureSpecificElementScreen(driver, element,"ScreenshotSpecificElement");
//		Shutterbug.shootPage(driver).withName("Screenshot").save("C:\\Users\\dheer\\Desktop\\New folder");
		
//		Utility.captureScreenShotWithURLandDateTime("NewScreenshot");
	}
	

}
