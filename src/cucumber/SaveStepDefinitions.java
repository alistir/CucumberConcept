package cucumber;

import static org.junit.Assert.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SaveStepDefinitions {
	
	
	@Given("^I have loaded a quote$")
	public void givenILoadedAQuote() throws Throwable {
	    System.out.println("the quote loaded OK");
	}

	@When("^I select the save button$")
	public void whenSaveButtonClicked() throws Throwable {
		System.out.println("I just pressed the save button");
	}
	
	@Then("^the quote saves to Universe$")
	public void quoteSavedToUniverse() throws Throwable {
		System.out.println("I can see the data in Universe");
	}
	
	@And("^the quote ID is \"(.*?)\"$")
	public void the_quote_ID_is(String arg1) throws Throwable {
		
		System.out.println(arg1.substring(0, 3));
		assertTrue(arg1.substring(0, 3).equals("111")); 
		
		System.out.println("--------------------------------------------------\n\n");
	}

}
