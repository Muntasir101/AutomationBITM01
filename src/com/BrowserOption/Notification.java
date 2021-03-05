package com.BrowserOption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Notification {

	public static void main(String[] args) {
		WebDriver driver;
		String GeckoDriverPath="E:\\Training\\PeopleNTech\\BITM Batch 1\\Tools\\geckodriver.exe";
		String TestUrl="";
				
		//gecko driver path set
		System.setProperty("webdriver.gecko.driver", GeckoDriverPath);		
	
		FirefoxOptions option=new FirefoxOptions();
		
		option.addArguments("--disable-notification");
	
		driver=new FirefoxDriver(option);
		
		driver.get(TestUrl);
		

	}

}
