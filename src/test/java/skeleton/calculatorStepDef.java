package skeleton;

import java.util.regex.Matcher;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class calculatorStepDef {
	private int total;
	 Calculator c=new Calculator();
	 
	 @Given("^I have a calculator$")
	 public void i_have_a_calculator() throws Throwable {
		
	     
	 }
	 @When("^I add -(\\d+) and (\\d+)$")
	 public void i_add_and(int num1, int num2) throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	    total=c.add(num1, num2);
	 }
	


@Then("^the result should be (\\d+)$")
public void the_result_should_be(int total) throws Throwable {
   System.out.println(total);
}

}
