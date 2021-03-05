package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeBrowserConfig {

	public static void main(String[] args) {
		
		WebDriver driver;
		String ChromeDriverpath="E:\\Training\\PeopleNTech\\BITM Batch 1\\Tools\\chromedriver.exe";
	
		//chromedriver path set
		System.setProperty("webdriver.chrome.driver", ChromeDriverpath);
		
		// Open Chrome
		driver=new ChromeDriver();
		

	}

}
