package com.automation.steps;

import com.automation.pages.SearchResultPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchResultPageSteps extends SearchResultPage{

	@Then("User see search result for {string}")
	public void user_see_search_result_for_shoes(String product) {
		verifySearchResultForProduct(product);
	}
	
	@When("User select first product from search result page")
	public void user_select_first_product() {
		selectFirstProductFromResult();
	}

}
