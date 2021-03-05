package com.BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorDemo {

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
		//Email.sendKeys("mail22@mail.com");
		
		//Locate Email by Name
		WebElement Email2=driver.findElement(By.name("email"));
		//Email2.sendKeys("mail22@mail.com");
		

		//Locate Email by Xpath
		WebElement Email3=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		//Email3.sendKeys("mail22@mail.com");
		
		//Locate Email by CssSelector
		WebElement Email4=driver.findElement(By.cssSelector("#input-email"));
		Email4.sendKeys("mail22@mail.com");
		
		//Locate Forgotten Password by LinkText
		WebElement ForgottenPassword=driver.findElement(By.linkText("Forgotten Password"));
		ForgottenPassword.click();
		
		
		//driver.close();
		
		driver.quit();
		
	}

}
