package com.simplepageobject.googleproject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.simplepageobject.googleproject.LaunchDriver;
import com.simplepageobject.googleproject.NavigateURL;

public class GoogleSearchTest {
	WebDriver driver;

	@Test
	public void DemoTest(){
		LaunchDriver ld = new LaunchDriver();
		
		driver = ld.firefox();
		NavigateURL url = new NavigateURL(driver);
		url.searchUrl("https://www.google.co.in");
		
	}
}