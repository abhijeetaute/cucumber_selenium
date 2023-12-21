package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.automation.component.Product;
import com.automation.pages.HomePage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

	ScenarioContext context;

	HomePage homePage=new HomePage();

	

	@Given("User launch home page of application")
	public void user_launch_home_page_of_application() {
		//homePage.launchApplication();
	}
	
	@Then("User navigate to {string} from top menu")
	public void user_navigateToMenu(String menuName) {
		homePage.navigateToMenu(menuName);
	}
	
	
	@Then("User verify only {string} books are displayed")
	public void verifyNewBooks(String count) {
		Assert.assertTrue(homePage.getProductList().size()==Integer.parseInt(count));
	}
	
	@Then("User clicks on {string} book")
	public void user_clicks_on_book(String productName) {
		for(Product product:homePage.getProductList()) {
			if(product.getProductName().getText().equalsIgnoreCase(productName)){
				product.getProductName().click();
				break;
			}
		}
	}

}
