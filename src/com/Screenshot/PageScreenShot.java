package com.Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageScreenShot {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver;
		String GeckoDriverPath="E:\\Training\\PeopleNTech\\BITM Batch 1\\Tools\\geckodriver.exe";
		String TestUrl="https://the-internet.herokuapp.com/";
				
		//gecko driver path set
		System.setProperty("webdriver.gecko.driver", GeckoDriverPath);		
		//Launch Firefox
		driver =new FirefoxDriver();
		
		// Open URL
		driver.get(TestUrl);

		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Take Screenshot
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File("E:\\Training\\PeopleNTech\\BITM Batch 1\\AutomationProject\\Automation\\Screenshot\\PageScreenshot.jpg"),true);
		
		driver.close();
	}

}
