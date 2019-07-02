package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {
	@Given("^I have some cakes in my hand$")
	public void i_have_some_cakes_in_my_hand() throws Throwable {
	   System.out.println("i have some cakes"); 
	    
	}

	@When("^I wait for some hour$")
	public void i_wait_for_some_hour() throws Throwable {
	    System.out.println("waiting for some hours");
	    
	}

	@Then("^my cakes will disapper$")
	public void my_cakes_will_disapper() throws Throwable {
	    System.out.println("cakes diapper");
	 
	}

}
