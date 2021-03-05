package com.MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwtchMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String GeckoDriverPath="E:\\Training\\PeopleNTech\\BITM Batch 1\\Tools\\geckodriver.exe";
		String TestUrl="https://the-internet.herokuapp.com/windows";

		//gecko driver path set
		System.setProperty("webdriver.gecko.driver", GeckoDriverPath);		
		//Launch Firefox
		driver =new FirefoxDriver();

		// Open URL
		driver.get(TestUrl);

		//Parent GUID
		String parentGUID=driver.getWindowHandle();

		//Click new window button
		WebElement NewWindorButton=driver.findElement(By.linkText("Click Here"));
		NewWindorButton.click();

		//Get all session id of Browser
		Set<String> allGUID=driver.getWindowHandles();

		// Iterate the value of the page
		// Child
		for(String ChildGUID : allGUID)
		{
			if(!ChildGUID.equals(parentGUID))
			{
				driver.switchTo().window(ChildGUID);

				driver.navigate().to("https://www.google.com");
				Thread.sleep(3000);
				System.out.println("Google Title: "+driver.getTitle());

				//Break the loop
				break;
			}
		}


		// back to Parent
		for(String ChildGUID : allGUID)
		{
			if(!ChildGUID.equals(parentGUID))
			{
				driver.switchTo().window(parentGUID);
				driver.get("https://facebook.com");

				System.out.println("Move back to parent window new Title:"+driver.getTitle());

				//Break the loop
				break;
			}
		}

		
		//Switch to Child
		// back to Parent
		for(String ChildGUID : allGUID)
		{
			if(!ChildGUID.equals(parentGUID))
			{
				driver.switchTo().window(ChildGUID);
				
				//driver.close();

				//Break the loop
				break;
			}
		}
		
		driver.quit();	


	}

}
