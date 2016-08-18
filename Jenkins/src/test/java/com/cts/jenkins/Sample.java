package com.cts.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {

	public String demo; 
	@Test	
	public void testMethod()
	{
		
		demo=System.getProperty("url");
		System.out.println(demo);
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("webdriver.chrome.driver", System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"));
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(dc);
		driver.get("http://www.google.com");
		
	}
}
