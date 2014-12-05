package cucumber;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class DataTableStepDefinitions {


	@When("^I click the convert to ticket button$")
	public void whenConvertButtonClicked() throws Throwable {
		System.out.println("I just pressed the convert to ticket button");
	}
	
	@And("^the quote is valid$")
	public void isQuoteValid() throws Throwable {
		System.out.println("the quote is valid");
		
	}
	
	@And("^a ticket is created on Universe$")
	//public void isUniverseTicketValid(DataTable table) throws Throwable {
	public void isUniverseTicketValid(Map<String, String> table) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		System.out.println(table);
		

		Map<String, String> ticketData = new HashMap<String, String>();
		ticketData.put("field", "value");
		ticketData.put("name", "ben");
		ticketData.put("orderno", "1234");
		ticketData.put("price", "54.25");
		

//		Alternatively you can cast table.raw() to a list of lists
//		List<List<String>> data = table.raw();
//		System.out.println(data.get(2).get(0));  // gets 3rd row, 2nd element
		
		assertEquals("ben",table.get("name"));
		assertTrue(table.equals(ticketData));

	}
}
