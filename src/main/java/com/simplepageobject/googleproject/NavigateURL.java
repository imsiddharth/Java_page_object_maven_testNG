package com.simplepageobject.googleproject;

import org.openqa.selenium.WebDriver;

public class NavigateURL {
	WebDriver driver;

	public NavigateURL(WebDriver driver){
		this.driver=driver;
	}

	void searchUrl(String url){
		driver.get(url);
		System.out.println("URL : "+ url);
	}
	
	void query(String query1){
		
	}
	
	
}