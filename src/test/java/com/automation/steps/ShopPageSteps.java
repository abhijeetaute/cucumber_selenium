package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.ShopPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopPageSteps {

	ScenarioContext context;

	ShopPage shopPage=new ShopPage();

	

	@Then("User clicks on {string} from breadcrum")
	public void clickOnBreadcrumMenu(String name)
	{
		shopPage.waitForPageToLoad();
		shopPage.navigateFromBreadcrum(name);
	}
	
}
