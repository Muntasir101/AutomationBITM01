package com.Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HighlightElementScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		String GeckoDriverPath="E:\\Training\\PeopleNTech\\BITM Batch 1\\Tools\\geckodriver.exe";
		String TestUrl="https://the-internet.herokuapp.com/checkboxes";
		System.setProperty("webdriver.gecko.driver", GeckoDriverPath);		
		driver =new FirefoxDriver();
		driver.get(TestUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]"));
		
		JavascriptExecutor jsc=(JavascriptExecutor) driver;
		
		//Highlight The element with red border 3px width
		jsc.executeScript("arguments[0].style.border='3px solid red'", element);
		
		Thread.sleep(2000);
		
		//Take screnshot
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		//save image screenshot to driver
		FileUtils.copyFile(srcFile, new File("E:\\Training\\PeopleNTech\\BITM Batch 1\\AutomationProject\\Automation\\Screenshot\\HighlightScreenshot.jpg"),true);

		driver.close();
	}

}
