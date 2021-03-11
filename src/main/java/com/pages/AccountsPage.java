package com.pages;



import java.util.ArrayList;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	
	private WebDriver driver;
	
	private By accountSections = By.cssSelector("div#center_column span");
	private By Tshirts = By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]");
	//private By Tshirts = By.xpath("//li[@class='sfHover']//a[@title='T-shirts'][normalize-space()='T-shirts']");
	
	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getAccountsPagetitle()
	{
		return driver.getTitle();
	}
	
	public String getTshirtPagetitle()
	{
		return driver.getTitle();
	}
	
	public int getAccountsSectionCount()
	{
		return driver.findElements(accountSections).size();
		 
	}
	
	public List<String> getAccountSectionsList()
	{
		List<WebElement> accountsheaderlist = driver.findElements(accountSections);
		List<String> accountlist = new ArrayList<>();
		
		for(WebElement e: accountsheaderlist)
		{
			String list = e.getText();
			accountlist.add(list);
		}
		
		return accountlist;
	}
	
	public TshirtsPage clickonTshirts() {
		driver.findElement(Tshirts).click();
		return new TshirtsPage(driver);
	}
}