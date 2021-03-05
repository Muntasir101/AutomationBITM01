package com.Headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefox {

	public static void main(String[] args) {
		
		String TestUrl="https://google.com";
		
		// step 1: set the path of browser
		String GeckoDriverPath="E:\\Training\\PeopleNTech\\BITM Batch 1\\Tools\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", GeckoDriverPath);
		
		// Step 2: create object for firefoxOptions 
		FirefoxOptions option=new FirefoxOptions();
		
		//Step 3: call a method setHeadless
		option.setHeadless(true);
		
		//step 4: create object for FirefoxDriver
		WebDriver driver=new FirefoxDriver(option);
		
		driver.get(TestUrl);
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		driver.close();
		
		

	}

}
