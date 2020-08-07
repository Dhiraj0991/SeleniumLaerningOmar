package dropDownDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectDropDown
{
	WebDriver driver;

	@Test
	public void dropDownTest() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver_84.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement dropdown=driver.findElement(By.id("select-demo"));
		
		Select dd=new Select(dropdown);
		
		String defaultValue=dd.getFirstSelectedOption().getText();
		
		Assert.assertEquals(defaultValue, "Please select");
		
		dd.selectByVisibleText("Saturday");
		
		System.out.println("The selected value is: "+driver.findElement(By.id("select-demo")).getAttribute("value"));
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
