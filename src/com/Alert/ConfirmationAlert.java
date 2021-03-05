package com.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String GeckoDriverPath="E:\\Training\\PeopleNTech\\BITM Batch 1\\Tools\\geckodriver.exe";
		String TestUrl="https://the-internet.herokuapp.com/javascript_alerts";
				
		//gecko driver path set
		System.setProperty("webdriver.gecko.driver", GeckoDriverPath);		
		//Launch Firefox
		driver =new FirefoxDriver();
		
		// Open URL
		driver.get(TestUrl);
		
		WebElement button=driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]/button"));
		
		button.click();
		Thread.sleep(5000);
		
		String AlertMessage=driver.switchTo().alert().getText();
		System.out.println(AlertMessage);
		
		
		//Cancel alert
		driver.switchTo().alert().dismiss();
		
		
	}

}
