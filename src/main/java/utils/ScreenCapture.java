package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.rev.selenium.base.BaseClass;

public class ScreenCapture extends BaseClass{
	
	
	public static void snapper() {
		
		java.util.Date date = new java.util.Date();
		String datestamp = date.toString().replace(" ", "-").replace(":", "-");
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots\\" + datestamp + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
