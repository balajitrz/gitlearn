package stepDefinitions;

import org.junit.Assert;

import common.Navigation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class SearchStepDefinitions {
	
	Navigation navigation = new Navigation();
	HomePage homePage = new HomePage();
	
	@When("^I perform a search with \"([^\"]*)\"$")
	public void i_perform_a_search_with(String searchTerm) throws Throwable {
		homePage.performSearch(searchTerm);		
	}

	@Then("^the India page is open$")
	public void the_India_page_is_open() throws Throwable {
		Assert.assertTrue("Page not loaded", navigation.getCurrentURL().equalsIgnoreCase("https://en.wikipedia.org/wiki/India"));
	}
}
