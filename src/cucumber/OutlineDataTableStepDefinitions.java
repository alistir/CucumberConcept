package cucumber;

import static org.junit.Assert.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class OutlineDataTableStepDefinitions {


	@Then("^the customer is (.*?)$")
	public void doesCustomerMatch(String arg1) throws Throwable {
		System.out.println("customer = " + arg1);
		assertTrue(arg1.substring(0, 2).equals("Mr")); 
	}
}
