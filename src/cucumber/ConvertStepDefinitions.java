package cucumber;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConvertStepDefinitions {


	@When("^I select the convert to ticket$")
	public void whenConvertButtonClicked() throws Throwable {
		System.out.println("I just pressed the convert button");
	}
	
	@When("^the quote is valid$")
	public void isQuoteValid() throws Throwable {
		System.out.println("the quote is valid");
	}
	
	@Then("^a ticket is created$")
	public void TicketCreatedInUniverse() throws Throwable {
		System.out.println("I can see the ticket in Universe");
	}
}
