package com.cts.jenkins;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {

	public String demo; 
	
	@Test	
	public void testMethod() throws MalformedURLException
	{
		
		demo=System.getProperty("url");
		System.out.println(demo);		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
	}
}
