package com.automation.steps;

import com.automation.pages.ProductDetailsPage;

import io.cucumber.java.en.Then;

public class ProductDetailsPageSteps extends ProductDetailsPage{

	@Then("User should see product details page for {string}")
	public void user_see_productDetails_page(String productName) {
		verifyProductDetailsPageIsOpened(productName);
	}
}
