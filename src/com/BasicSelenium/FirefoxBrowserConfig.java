package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserConfig {

	public static void main(String[] args) {
		
		WebDriver driver;
		String GeckoDriverPath="E:\\Training\\PeopleNTech\\BITM Batch 1\\Tools\\geckodriver.exe";
		
		//gecko driver path set
		System.setProperty("webdriver.gecko.driver", GeckoDriverPath);

		
		//Launch Firefox
		driver =new FirefoxDriver();		

	}

}
