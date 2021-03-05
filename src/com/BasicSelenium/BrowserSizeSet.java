package com.BasicSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSizeSet {

	public static void main(String[] args) {
		WebDriver driver;
		String GeckoDriverPath="E:\\Training\\PeopleNTech\\BITM Batch 1\\Tools\\geckodriver.exe";
		String TestUrl="https://demo.opencart.com/index.php?route=account/login";
		
		
		//gecko driver path set
		System.setProperty("webdriver.gecko.driver", GeckoDriverPath);

		
		//Launch Firefox
		driver =new FirefoxDriver();
		
		// Open URL
		driver.get(TestUrl);

		// set size of the browser
		driver.manage().window().setSize(new Dimension(600,400));
		
		//
		driver.quit();
		
	}

}
