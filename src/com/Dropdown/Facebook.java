package com.Dropdown;


import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

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
		
		//find the dropdown
		WebElement Month=driver.findElement(By.id("month"));
		
		//Create object for Select class
		Select sel=new Select(Month);
		
		//get all options and store in list
		java.util.List<WebElement> allElements=sel.getOptions();
		System.out.println("Values present are ");
		for(WebElement element:allElements) {
			System.out.println(element.getText());
		}
		

		//Select drop down option
		sel.selectByVisibleText("Apr");
		
		//find the dropdown
		WebElement Day=driver.findElement(By.id("day"));
		
		//Create object for Select class
		Select daySelect=new Select(Day);
			
		//Checking Day single or multiple value drop down
		boolean SingleOrMultiple=daySelect.isMultiple();
		
		if(SingleOrMultiple) {
			System.out.println("Multi Value Drop down");
		}
		else {
			System.out.println("Single value Drop down");
		}
		
		//Select drop down option
		daySelect.selectByIndex(4);
		
		//Checking Day single or multiple value drop down
		
		

	}

}
