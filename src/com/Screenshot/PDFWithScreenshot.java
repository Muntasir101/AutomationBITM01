package com.Screenshot;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFWithScreenshot {

	public static void main(String[] args) throws DocumentException, MalformedURLException, IOException {
		WebDriver driver;
		String GeckoDriverPath="E:\\Training\\PeopleNTech\\BITM Batch 1\\Tools\\geckodriver.exe";
		String TestUrl="https://google.com";
		System.setProperty("webdriver.gecko.driver", GeckoDriverPath);		
		driver =new FirefoxDriver();
		driver.get(TestUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Take Screenshot and store it in byte[] array format
		byte[] input=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
		Document document=new Document();
		
		String output="E:\\Training\\PeopleNTech\\BITM Batch 1\\AutomationProject\\Automation\\ResultPDF\\MyPdf.pdf";

		
		FileOutputStream fos=new FileOutputStream(output);
		
		//Instantiate the pdf writer
		PdfWriter writer=PdfWriter.getInstance(document, fos);
		
		//Open the pdf for writing 
		writer.open();
		document.open();
		
		//process content into add Image
		Image img=Image.getInstance(input);
		
		//Set the size of the image
		img.scaleToFit(PageSize.A4.getWidth()/2,PageSize.A4.getHeight()/2);
		
		//Add image to PDF
		document.add(img);
		document.add(new Paragraph(" "));
		
		//Close the files and save to local drive
		document.close();
		writer.close();
		
		driver.close();
		
	}

}
