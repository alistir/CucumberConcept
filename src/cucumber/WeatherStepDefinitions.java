package cucumber;

//import junit.framework.Assert;
import static org.junit.Assert.*; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.htmlunit.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WeatherStepDefinitions {

	WebDriver driver = null;
	
	@Given("^I am on the bbc site$")
	public void i_am_on_the_bbc_site() throws Throwable {
	    //driver = new FirefoxDriver();
	    driver = new HtmlUnitDriver();
	    //driver = new PhantomJSDriver();
	    driver.navigate().to("http://www.bbc.co.uk/");
	}
	// HTMLUnitDriver

	@When("^I select the weather link$")
	public void i_select_the_weather_link() throws Throwable {
	    //driver.findElement(By.id("")).click();
		//driver.findElement(By.name("EnterPostcode")).sendKeys("EX33 2NN");
	    driver.findElement(By.linkText("Weather")).click();
	}
	    
	@When("^I enter Barnstaple into the search box$")
	public void i_enter_Barnstaple_into_the_search_box() throws Throwable {
		driver.findElement(By.id("locator-form-search")).sendKeys("Barnstaple");
		driver.findElement(By.id("locator-form-search")).submit();
	}

	@Then("^the weather forecast page loads for Barnstaple$")
	public void the_weather_forecast_page_loads() throws Throwable {
	    //Assert.assertTrue("", condition);
	    assertEquals("BBC Weather - Barnstaple", driver.getTitle().toString()); 
	    
	}
	
}
