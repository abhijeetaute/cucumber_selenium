package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.automation.loc.PageLocators.ProductDetailsPageLoc;

public class ProductDetailsPage extends BaseClass implements ProductDetailsPageLoc{
	
	@FindBy(xpath=ProductName)
	private WebElement itemTitle;
	
	@FindBy(xpath=Price)
	private WebElement price;
	
	@FindBy(xpath=Quanity)
	private WebElement quantity;
	
	@FindBy(xpath=AddToCartButton)
	private WebElement addToCartButton;
	
	
	public void waitForPageToLoad() {
		waitForElementToBePresent(quantity);
		waitForPageLoad();
	}
	
	public void verifyProductDetailsPageIsOpened(String productName) {
		waitForElementToBePresent(itemTitle);
		Assert.assertTrue(itemTitle.getText().trim().equalsIgnoreCase(productName.trim()),"Product name on details page is not matching");
		}
	
	public void addProductToCart() {
		waitForElementToBePresent(addToCartButton);
		addToCartButton.click();
		
	}
	
	

}
