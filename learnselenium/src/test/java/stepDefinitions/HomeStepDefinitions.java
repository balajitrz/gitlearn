package stepDefinitions;

import org.junit.Assert;

import common.Navigation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomeStepDefinitions {
	
	Navigation navigation = new Navigation();
	HomePage homePage = new HomePage();
	
	@Given("^I have opened the application$")
	public void i_have_opened_the_application() throws Throwable {
		navigation.goToURL("https://www.wikipedia.org/");
	}

	@When("^I view the home page$")
	public void i_view_the_home_page() throws Throwable {
	}

	@Then("^the logo text should be \"([^\"]*)\"$")
	public void the_logo_text_should_be(String logoText) {
		Assert.assertTrue("Logo text is incorrect. Actual Logo text: " + homePage.getLogoText(), homePage.getLogoText().equalsIgnoreCase(logoText));
		
	}

	@Then("^the search box should be visible$")
	public void the_search_box_should_be_visible() throws Throwable {
		Assert.assertTrue("Logo text is incorrect",homePage.isSearchBoxDisplayed());
	}
}
