package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OneStepDefinitions {
	@Given("^I have opened the application$")
	public void i_have_opened_the_application() throws Throwable {
	}

	@When("^I try to search on news$")
	public void i_try_to_search_on_news() throws Throwable {
	}

	@Then("^I should be taken to results page with relevant results$")
	public void i_should_be_taken_to_results_page_with_relevant_results() throws Throwable {
	}

	@When("^I try to search on weather$")
	public void i_try_to_search_on_weather() throws Throwable {
	}

	@When("^I enter a <keyword> and click IamFeelingLucky button$")
	public void i_enter_a_keyword_and_click_IamFeelingLucky_button() throws Throwable {
	}

	@Then("^I should be taken to corresponding website$")
	public void i_should_be_taken_to_corresponding_website() throws Throwable {
	}
}
