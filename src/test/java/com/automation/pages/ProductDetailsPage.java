package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductDetailsPage extends BaseClass{
	
	@FindBy(xpath="//h1[contains(@class,'x-item-title')]/span")
	private WebElement itemTitle;
	
	@FindBy(xpath="//div[@data-testid='x-bin-action']/a")
	private WebElement buyItNowButton;
	
	@FindBy(xpath="//div[@data-testid='x-atc-action']/a")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//input[@id='qtyTextBox']")
	private WebElement quantityInput;
	
	
	public void verifyProductDetailsPageIsOpened(String productName) {
		waitForElementToBePresent(itemTitle);
		Assert.assertTrue(itemTitle.getText().trim().equalsIgnoreCase(productName.trim()),"Product name on details page is not matching");
		}
	
	public void addProductToCart() {
		waitForElementToBePresent(addToCartButton);
		addToCartButton.click();
		
	}
	
	public void fillAddressDetails() {
		
	}

}
