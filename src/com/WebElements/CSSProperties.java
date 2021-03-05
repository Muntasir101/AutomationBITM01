package com.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSProperties {

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
		
		//Locate Email by ID
		WebElement Email=driver.findElement(By.id("input-email"));
		
		//Size
		Dimension size=Email.getSize();
		System.out.println(size);
		
		//BG
		String BGColor=Email.getCssValue("background-color");
		System.out.println(BGColor);
		
		//color
		String Color=Email.getCssValue("color");
		System.out.println(Color);
		
		//border Radius
		String borderRadius=Email.getCssValue("border-radius");
		System.out.println(borderRadius);
	}

}
