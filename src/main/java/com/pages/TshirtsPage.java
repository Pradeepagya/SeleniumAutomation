package com.pages;


import org.openqa.selenium.WebDriver;

public class TshirtsPage {
	
	private WebDriver driver;
	
		
	// 2. Constructor of the page class:
		public TshirtsPage(WebDriver driver) {
			this.driver = driver;
		}
		
		public String getTshirtsPagetitle()
		{
			return driver.getTitle();
		}

		

}
