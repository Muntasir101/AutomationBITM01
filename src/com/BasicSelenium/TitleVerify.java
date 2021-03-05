package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleVerify {

	public static void main(String[] args) {
		WebDriver driver;
		String GeckoDriverPath="E:\\Training\\PeopleNTech\\BITM Batch 1\\Tools\\geckodriver.exe";
		String TestUrl="https://demo.opencart.com";
		
		String ExpectedTitle="your store";
		
		//gecko driver path set
		System.setProperty("webdriver.gecko.driver", GeckoDriverPath);

		
		//Launch Firefox
		driver =new FirefoxDriver();
		
		// Open URL
		driver.get(TestUrl);
		
		
		// Get Title 
		String ActualTitle=driver.getTitle();
		
		// Verify Title
		if(ActualTitle.endsWith("Store"))
		{
			System.out.println("Verified");
		}
		else
		{
			System.out.println("Verify failed "+"Actual Title="+ActualTitle);
		}
		
		
		
		driver.close();
		
	}

}
