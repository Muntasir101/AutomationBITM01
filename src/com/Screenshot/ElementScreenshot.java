package com.Screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		String GeckoDriverPath="E:\\Training\\PeopleNTech\\BITM Batch 1\\Tools\\geckodriver.exe";
		String TestUrl="https://the-internet.herokuapp.com/checkboxes";

		//gecko driver path set
		System.setProperty("webdriver.gecko.driver", GeckoDriverPath);		
		//Launch Firefox
		driver =new FirefoxDriver();

		// Open URL
		driver.get(TestUrl);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement element=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]"));

		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		//Using selenium point to get X and Y coordinate of image
		//Get location of Element

		Point point=element.getLocation();
		int Xcoordinate=point.getX();
		int Ycoordinate=point.getY();

		/*
		 * Using selenium getSize() to get height and width
		 */
		int imageWidth=element.getSize().getWidth();
		int imageHeight=element.getSize().getHeight();

		//Reading full image
		BufferedImage img=ImageIO.read(srcFile);

		//Cut image using height,width,X and Y 
		BufferedImage FinalImage=img.getSubimage(Xcoordinate, Ycoordinate, imageWidth, imageHeight);
		ImageIO.write(FinalImage, "png", srcFile);

		//Save Image
		FileUtils.copyFile(srcFile, new File("E:\\Training\\PeopleNTech\\BITM Batch 1\\AutomationProject\\Automation\\Screenshot\\ElementScreenshot.png"),true);

		driver.close();

	}

}
