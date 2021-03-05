package com.PropertiesDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		
		//Create  FileInputStream object for properties file
		FileInputStream fis=new FileInputStream("E:\\Training\\PeopleNTech\\BITM Batch 1\\AutomationProject\\Automation\\src\\PropertiesFile\\config.properties");
		
		// create object for properties class
		Properties prop=new Properties();
		
		//Load properties
		prop.load(fis);
		

		System.setProperty("webdriver.gecko.driver", prop.getProperty("GeckoDriverPath"));
		WebDriver driver = new FirefoxDriver();
		driver.get(prop.getProperty("BaseUrl"));

		WebElement Email=driver.findElement(By.id(prop.getProperty("Email_By_ID")));
		Email.sendKeys(prop.getProperty("Email_Value"));
		
	}

}
