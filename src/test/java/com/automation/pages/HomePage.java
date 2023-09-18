package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BaseClass{

	@FindBy(xpath="//a[contains(@href,'https://signin.ebay.com/')]")
	private WebElement signInLink;
	
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	private WebElement searchInput;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchBtn;
	

	
	public void navigateToLoginPage() {
		signInLink.click();
		waitForElementNotToBePresent(signInLink);
	}
	
	public void searchForProduct(String searchKeyword) {
		waitForElementToBePresent(searchInput);
		searchInput.sendKeys(searchKeyword);
		searchBtn.click();
	}
}
