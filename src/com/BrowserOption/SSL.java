package com.BrowserOption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSL {

	public static void main(String[] args) {
		WebDriver driver;
		String GeckoDriverPath="E:\\Training\\PeopleNTech\\BITM Batch 1\\Tools\\geckodriver.exe";
		String TestUrl="https://cacert.org/";
				
		//gecko driver path set
		System.setProperty("webdriver.gecko.driver", GeckoDriverPath);		
	
		FirefoxOptions option=new FirefoxOptions();
		
		//Accept certificate
		option.setAcceptInsecureCerts(false);
		
		driver=new FirefoxDriver();
		
		driver.get(TestUrl);
		
	}

}
