package com.test.maven.SelMaven;


import java.io.File;

import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium {

	@Test
	public void test() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://www.google.com");
		String actual=dr.getTitle();
		String expetced ="Google";
		Assert.assertEquals(actual, expetced);
		
//		Set<String>win=dr.getWindowHandles();
//	   Iterator<String>  itr=win.iterator();
//	   itr.next();
		
	    TakesScreenshot ts =(TakesScreenshot) dr;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./ScreenShots/"+1+".png"));
		
		
		dr.close();
	}
}
