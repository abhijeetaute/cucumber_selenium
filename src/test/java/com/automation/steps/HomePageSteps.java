package com.automation.steps;

import com.automation.pages.HomePage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

	ScenarioContext context;

	HomePage homePage=new HomePage();
	/*
	 * @Given("user is on application homepage") public void
	 * user_is_on_application_homepage() {
	 * System.out.println("setting context value"); context = new ScenarioContext();
	 * context.setContext("PageTitle", "TestHomePage"); }
	 * 
	 * @When("user click on signup button") public void
	 * user_click_on_signup_button() { System.out.println("Reading context value");
	 * System.out.println(context.getContext("PageTitle")); }
	 */
	
	@Before
	public void before() {
		//setUp();
	}
	@Given("User launch home page of application")
	public void user_launch_home_page_of_application() {
		//setUp();
	}
	
	@When("User navigate to login page")
	public void user_navigate_to_login_page() {
	   homePage.navigateToLoginPage();
	}

	
	@Then("User search for product {string}")
	public void user_searche_for_product(String product) {
		 homePage.searchForProduct(product);
	}
}
