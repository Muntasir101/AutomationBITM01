package com.MouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		WebDriver driver;
		String GeckoDriverPath="E:\\Training\\PeopleNTech\\BITM Batch 1\\Tools\\geckodriver.exe";
		String TestUrl="http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
				
		//gecko driver path set
		System.setProperty("webdriver.gecko.driver", GeckoDriverPath);		
		//Launch Firefox
		driver =new FirefoxDriver();
		
		// Open URL
		driver.get(TestUrl);
		
		WebElement DragCity=driver.findElement(By.id("box3"));
		WebElement DropCountry=driver.findElement(By.id("box103"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(DragCity, DropCountry);
		
		act.perform();

	}

}
