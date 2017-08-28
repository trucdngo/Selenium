package com.ngo.truc.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class SetUpWebDrivers {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		String baseUrl = "http://www.google.com";
		
		
		/* Set-up for Chrome Browser */
		//https://chromedriver.storage.googleapis.com/index.html?path=2.31/
		/*
		System.setProperty("webdriver.chrome.driver", "/Users/trucngo/Documents/Selenium/chromedriver");
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setPlatform(Platform.MAC);
		driver = new ChromeDriver(dc);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		Thread.sleep(2000);
		driver.quit();
		*/
		
		
		/*set up for Firefox Browser */
		/*
		//https://github.com/mozilla/geckodriver/releases
		System.setProperty("webdriver.gecko.driver", "/Users/trucngo/Documents/Selenium/geckodriver");
		//chmod 555 driverName
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setPlatform(Platform.MAC);
		driver = new FirefoxDriver(dc);
		driver.manage().window().maximize();
		driver.get(baseUrl);	
		Thread.sleep(2000);
		driver.quit();
		*/
		
		/*Set up for Safari Browser */
		/*
		//http://selenium-release.storage.googleapis.com/index.html?path=3.5/
		DesiredCapabilities dc = DesiredCapabilities.safari();
		dc.setPlatform(Platform.MAC);
		driver = new SafariDriver(dc);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		Thread.sleep(2000);
		driver.quit();
		*/
		
		/*Set up for IE Browser */
		/* Zoom level should be 100% */
		/* all zone should be the same */
		/* download 32-bit driver, NOT 64-bit */
		/*
		System.setProperty("webdriver.ie.driver", "/Users/trucngo/Documents/Selenium/IEDriverServer.exe");
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		dc.setPlatform(Platform.WIN10);
		driver = new SafariDriver(dc);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		Thread.sleep(2000);
		driver.quit();
		*/
	}

}
