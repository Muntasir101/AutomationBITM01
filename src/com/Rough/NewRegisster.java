package com.Rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewRegisster {

	public static void main(String[] args) throws InterruptedException {

		String baseUrl = "http://demo.automationtesting.in/Register.html";
		System.setProperty("webdriver.gecko.driver","E:\\Training\\PeopleNTech\\BITM Batch 1\\Tools\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);

		/*
		// 4 | type | Muntasir
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Muntasir");

		// 6 | type | Abdullah
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Abdullah");


		// 8 | type | Dhaka, Bangladesh
		driver.findElement(By.tagName("textarea")).sendKeys("Dhaka, Bangladesh");

		// 10 | type | css=#eid > .form-control | muntasir.abdullah01@gmail.com
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("muntasir.abdullah01@gmail.com");

		// 12 | type | css=.col-md-4 > .ng-invalid-pattern | 01737951060
		 driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("01737951060");

		// 13 | click | name=radiooptions | 
		driver.findElement(By.name("radiooptions")).click();

		// 14 | click | id=checkbox1 | 
		driver.findElement(By.id("checkbox1")).click();

		 */

		// 15 | click | id=msdd | 
		driver.findElement(By.id("msdd")).click();
		Thread.sleep(2000);


		// 16 | click | linkText=English | 
		driver.findElement(By.linkText("English")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[8]/label")).click();

		// 17 | click | id=countries | 
		driver.findElement(By.id("countries")).click();

		// 18 | select | id=countries | label=Bangladesh
		{
			WebElement dropdown = driver.findElement(By.id("countries"));
			dropdown.findElement(By.xpath("//option[. = 'Bangladesh']")).click();
		}

		// 19 | click | id=countries | 
		driver.findElement(By.id("countries")).click();

		// 20 | click | css=.select2-selection | 
		driver.findElement(By.cssSelector(".select2-selection")).click();

		// 21 | click | id=yearbox | 
		driver.findElement(By.id("yearbox")).click();

		// 22 | select | id=yearbox | label=1934
		{
			WebElement dropdown = driver.findElement(By.id("yearbox"));
			dropdown.findElement(By.xpath("//option[. = '1934']")).click();
		}

		// 23 | click | id=yearbox | 
		driver.findElement(By.id("yearbox")).click();

		// 24 | click | css=.col-md-3:nth-child(3) > .form-control | 
		driver.findElement(By.cssSelector(".col-md-3:nth-child(3) > .form-control")).click();

		// 25 | select | css=.col-md-3:nth-child(3) > .form-control | label=February
		{
			WebElement dropdown = driver.findElement(By.cssSelector(".col-md-3:nth-child(3) > .form-control"));
			dropdown.findElement(By.xpath("//option[. = 'February']")).click();
		}

		// 26 | click | css=.col-md-3:nth-child(3) > .form-control | 
		driver.findElement(By.cssSelector(".col-md-3:nth-child(3) > .form-control")).click();

		// 27 | click | id=daybox | 
		driver.findElement(By.id("daybox")).click();

		// 28 | select | id=daybox | label=17
		{
			WebElement dropdown = driver.findElement(By.id("daybox"));
			dropdown.findElement(By.xpath("//option[. = '17']")).click();
		}

		// 29 | click | id=daybox | 
		driver.findElement(By.id("daybox")).click();

		// 30 | click | id=firstpassword | 
		driver.findElement(By.id("firstpassword")).click();

		// 31 | type | id=firstpassword | 12345678
		driver.findElement(By.id("firstpassword")).sendKeys("12345678");

		// 32 | click | id=secondpassword | 
		driver.findElement(By.id("secondpassword")).click();

		// 33 | type | id=secondpassword | 12345678
		driver.findElement(By.id("secondpassword")).sendKeys("12345678");

		// 34 | click | id=imagesrc | 
		driver.findElement(By.id("imagesrc")).click();

		// 35 | type | id=imagesrc | C:\fakepath\image.jpg
		//driver.findElement(By.id("imagesrc")).sendKeys("C:\\fakepath\\image.jpg");

		// 36 | click | id=submitbtn | 
		driver.findElement(By.id("submitbtn")).click();

	}
}

