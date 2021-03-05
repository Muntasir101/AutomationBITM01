package com.MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllGUID {

	public static void main(String[] args) {
		WebDriver driver;
		String GeckoDriverPath="E:\\Training\\PeopleNTech\\BITM Batch 1\\Tools\\geckodriver.exe";
		String TestUrl="https://the-internet.herokuapp.com/windows";
				
		//gecko driver path set
		System.setProperty("webdriver.gecko.driver", GeckoDriverPath);		
		//Launch Firefox
		driver =new FirefoxDriver();
		
		// Open URL
		driver.get(TestUrl);
		
		String parentGUID=driver.getWindowHandle();
		System.out.println("Parent Windor GUID: "+parentGUID);
		
		WebElement NewWindorButton=driver.findElement(By.linkText("Click Here"));
		NewWindorButton.click();
		
		//Get all session id of Browser
		Set<String> allGUID=driver.getWindowHandles();
		System.out.println(allGUID);
		
		// Print Title of the page
		System.out.println("Page Title Before Switching: "+driver.getTitle());
		System.out.println("Total Window: "+allGUID.size());
		
		driver.quit();

	}

}
