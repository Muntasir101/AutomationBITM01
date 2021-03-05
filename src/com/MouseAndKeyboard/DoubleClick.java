package com.MouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver;
		String GeckoDriverPath="E:\\Training\\PeopleNTech\\BITM Batch 1\\Tools\\geckodriver.exe";
		String TestUrl="https://www.facebook.com/";
				
		//gecko driver path set
		System.setProperty("webdriver.gecko.driver", GeckoDriverPath);		
		//Launch Firefox
		driver =new FirefoxDriver();
		
		// Open URL
		driver.get(TestUrl);
		
		WebElement ele=driver.findElement(By.linkText("Create a Page"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(ele);
		act.perform();

	}

}
