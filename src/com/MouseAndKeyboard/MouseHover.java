package com.MouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		String baseUrl = "http://newtours.demoaut.com/";
		System.setProperty("webdriver.gecko.driver","E:\\Training\\PeopleNTech\\BITM Batch 1\\Tools\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);           
		WebElement link_Home = driver.findElement(By.linkText("Home"));
		WebElement td_Home = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]")); 
		
		

		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(link_Home).build();

		String bgColor = td_Home.getCssValue("background-color");
		System.out.println("Before hover: " + bgColor); 
		
		mouseOverHome.perform();      

		bgColor = td_Home.getCssValue("background-color");
		System.out.println("After hover: " + bgColor);
		
		
		driver.close();
	}

}


