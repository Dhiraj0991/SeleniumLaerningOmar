package lib;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Utility
{

	
	public static void getScreenShot(WebDriver driver, String screenShotName) throws Exception
	{
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		String path="C:\\Users\\dheer\\Desktop\\New folder\\"+screenShotName+".png";
		
		File destination=new File(path);
		
		FileUtils.copyFile(source, destination);
		
//		Shutterbug.shootPage(driver).withName(screenShotName).save("C:\\Users\\dheer\\Desktop\\New folder");
		
	}
	
	public static void captureScreenShotWithURLandDateTime(String screenshotName) throws Exception
	{
		
		Robot r=new Robot();
		
		Rectangle rect= new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		
		BufferedImage screenShot= r.createScreenCapture(rect);
		
		String path="C:\\Users\\dheer\\Desktop\\New folder\\"+screenshotName+".png";
		ImageIO.write(screenShot, "PNG", new File(path));
	}
}
