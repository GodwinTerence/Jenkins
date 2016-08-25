package com.cts.jenkins;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {

	public String demo;

	public WebDriver driver;

	@BeforeMethod
	public void setUp() {
		File pathToBinary = new File(
				"C:\\Users\\PEARSON-PC\\Downloads\\firefox-47.0.1.win64.sdk\\firefox-sdk\\bin\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		driver = new FirefoxDriver(ffBinary, firefoxProfile);
	}

	@Test
	public void testMethod() throws MalformedURLException {

		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//*[@id='sb_ifc0']")).sendKeys("Godwin");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
