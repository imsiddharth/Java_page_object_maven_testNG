package com.simplepageobject.googleproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchDriver {
	WebDriver driver;
	WebDriver firefox()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	void quit()
	{
		driver.quit();
	}
}
