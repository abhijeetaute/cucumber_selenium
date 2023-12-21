package com.automation.steps;

import com.automation.pages.ProductDetailsPage;

import io.cucumber.java.en.Then;

public class ProductDetailsPageSteps{

	ProductDetailsPage productDetailsPage=new ProductDetailsPage();
	
	@Then("User see product details page for {string}")
	public void user_see_productDetails_page(String productName) {
		productDetailsPage.verifyProductDetailsPageIsOpened(productName);
	}
}
