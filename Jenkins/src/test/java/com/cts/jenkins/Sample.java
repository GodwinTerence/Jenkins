package com.cts.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {

	public String demo; 
	@Test	
	public void testMethod(String url)
	{
		demo=System.getProperty("url");
		System.out.println(demo);
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(demo);
	}
}
